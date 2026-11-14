# Taller Práctico: Arquitectura de Componentes en Java (.jar)

**Microclase:** Componentes — *Component Quest*

**Integrantes:**
- Juan Sneyder Mendez Gil - 20251020010

## Estructura del repositorio

```
.
├── 1-codigo-inicial/      Código base con fallas de diseño (para el diagnóstico)
│   ├── modulo-espada/
│   ├── modulo-peto/
│   ├── modulo-botas/
│   ├── modulo-casco/
│   └── juego-principal/
├── 2-refactorizado/       Proyectos corregidos
│   ├── modulo-core/       GemaEnergia  -> core-v1.0.jar
│   ├── modulo-espada/     EspadaExplorador -> espada-v1.0.jar
│   ├── modulo-peto/       PetoEnlace -> peto-v1.0.jar
│   ├── modulo-botas/      BotasEnlace -> botas-v1.0.jar
│   ├── modulo-casco/      ProteccionElemental, CascoHierroSellado, CascoRunico -> casco-v1.0.jar
│   └── juego-principal/   Main.java de integración
├── jars/                  Los 5 .jar versionados
└── 3-informe/             Informe del taller (PDF)
```

## Grafo de dependencias final

```
juego-principal ──> espada, peto, botas, casco, core
peto  ──> core
botas ──> core
```

No hay ciclos: `peto` y `botas` dependen únicamente de la interfaz `GemaEnergia` de `core`.

## Cómo ejecutar el proyecto principal

Agregar los 5 `.jar` de la carpeta `jars/` a las librerías de `juego-principal` y ejecutar `app.Main`.

Desde consola (opcional):

```bash
javac -cp "jars/*" -d out 2-refactorizado/juego-principal/src/app/Main.java
java  -cp "jars/*:out" app.Main      # en Windows usar ; en lugar de :
```
