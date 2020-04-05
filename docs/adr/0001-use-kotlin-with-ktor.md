# Use Kotlin with Ktor

* Status: accepted
* Deciders: Alexandre C. Barbosa
* Date: 2020-04-05

## Context and Problem Statement

We need to define a language and a framework to build this service.

## Decision Drivers

* The language must provide *Static Type Checking*
* The framework must be minimal

## Considered Options

### Languages
* Java
* C#
* Kotlin

### Frameworks
* Ktor
* Javalin
* Micronaut

## Decision Outcome

Chosen option: "Kotlin with Ktor", because:

* Kotlin seems more concise than Java and C#
* Kotlin is fully interoperable with Java, allowing us to make use of its proven platform
* Kotlin's type inference makes it easier to code, while maintaining the benefits of *static type checking*
* Ktor is the only analyzed framework solely focused on Kotlin
* Micronaut seems too much