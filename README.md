# Simple Orchestrator

Simple Orchestrator is a java library that can simplify your application development.

## Features that just done that:

### 1. Promote modularization and isolation:
    Create your functional blocks and services as Tasks.
    Task can only sees it's context, such isolated from everything else.

### 2. Productivity:
    Task creation is extreamly simple, just implement an execute method.
    No data packaging/unpackage required.
    No need to create your own processes, just use the default OrchestratorImpl.

### 3. Code reusability:
    Task can be added into any orchestrator as long as the orchestrator's context is compatible.
    Create an orchestrator context is simple and like an entity class.

### 4. Capable of selectively execute/skip tasks. a selector is simple to implement.

### 5. Support uniform ways to handle errors and events.

### 6. Support asynchronous tasks.
    the orchestrator execute needs to wait for an async task to finish only when another task
    requres it's output, such provides high efficiency, and data availability are guaranteed.

### 7. Flexible:
    Easy swap in a replacement task, even dynamically select a version by using selector.
    Add gadget task for monitoring, logging, delaying etc.

### 8. Type safe:
    Task, Context, Selector, Channel and Orchestrator are all static typed.
    any mismatch will cause compile time error.

### 9. Visualization:
    Build-in support for meta data and visualization
    refer to "visualization" sub project.
    
    sample orchestrator visulization result:
<img src="https://raw.githubusercontent.com/eriche39/simple-orchestrator/master/samples/visual.png" width=490 height=520 />

## The sample project shows most of the features.

## License

See the [LICENSE](LICENSE.md) file for license rights and limitations (MIT).