```mermaid
classDiagram

class Juego {
  <<abstract>>
  - String nombre
  - Jugador jugador
  - int puntuacion
  + iniciar()
  + actualizar()
  + finalizar()
  + mostrarEstado()
}

class Jugador {
  - String nombre
  - int edad
  - int puntuacionTotal
  + sumarPuntos(int)
  + reiniciarPuntos()
  + getNombre()
}

class MotorJuego {
  - Juego juegoActual
  + seleccionarJuego(int)
  + ejecutarJuego()
}

%% =========================
%% PREGUNTADOS
%% =========================

class Preguntados {
  - BancoPreguntas banco
  - Categoria categoriaActual
  + cargarPreguntas()
  + lanzarPregunta()
  + comprobarRespuesta(String)
}

class BancoPreguntas {
  - List~Pregunta~ preguntas
  + agregarPregunta(Pregunta)
  + obtenerPreguntaAleatoria()
}

class Pregunta {
  - String enunciado
  - List~String~ opciones
  - String respuestaCorrecta
  - Categoria categoria
  + esCorrecta(String)
}

class Categoria {
  <<enumeration>>
  HISTORIA
  CIENCIA
  DEPORTE
  ARTE
}

Preguntados --> BancoPreguntas
BancoPreguntas "1" o-- "*" Pregunta
Pregunta --> Categoria
}

core.Juego <|-- preguntados.Preguntados

%% =========================
%% BINGO
%% =========================

class Bingo {
  - Carton carton
  - List~int~ numerosSalidos
  - GeneradorNumeros generador
  + iniciarSorteo()
  + comprobarBingo()
}

class Carton {
  - int[][] numeros
  - boolean[][] marcados
  + marcarNumero(int)
  + hayLinea()
  + hayBingo()
}

class GeneradorNumeros {
  - List~int~ numerosDisponibles
  + generarNumero()
}

Bingo *-- Carton
Bingo *-- GeneradorNumeros
}

core.Juego <|-- bingo.Bingo

%% =========================
%% BRICK BREAKER
%% =========================

namespace brickbreaker {

class BrickBreaker {
  - Pelota pelota
  - Barra barra
  - Nivel nivel
  + iniciarNivel()
  + detectarColisiones()
  + actualizar()
}

class Pelota {
  - double x
  - double y
  - double velocidadX
  - double velocidadY
  + mover()
  + rebotar()
}

class Barra {
  - double x
  - double ancho
  + moverIzquierda()
  + moverDerecha()
}

class Nivel {
  - List~Ladrillo~ ladrillos
  + cargarNivel()
  + quedanLadrillos()
}

class Ladrillo {
  - double x
  - double y
  - int resistencia
  + recibirImpacto()
  + estaDestruido()
}

BrickBreaker *-- Pelota
BrickBreaker *-- Barra
BrickBreaker *-- Nivel
Nivel "1" *-- "*" Ladrillo
}
```
