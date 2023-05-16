Android MVI (Model-View-Intent) Architecture Example with Jetpack Compose


This repository contains an example Android application that demonstrates the implementation of the Model-View-Intent (MVI) architecture using Jetpack Compose. MVI designed to provide a clear separation of concerns and improve testability and maintainability of Android applications. Jetpack Compose is the modern UI toolkit for building native Android apps, which simplifies the UI development process.

Overview
The example application showcases how to build a simple task management app using the MVI architecture with Jetpack Compose. It consists of three main components:

Model: Represents the application's data and business logic. It manages the state of the application and exposes a unidirectional flow of data updates.

View: Handles the UI rendering and user interaction. It observes the state changes from the model and updates the UI accordingly using Jetpack Compose.

Intent: Captures the user's intentions or actions. It sends these intents to the model to trigger state updates.

The MVI architecture promotes a unidirectional data flow, where the view sends intents to the model, the model processes the intents, 
updates its state, and emits a new state. The view observes the state changes and reflects them in the UI using Jetpack Compose.

Key Features
* MVI architecture implementation using Kotlin, Jetpack Compose, and Android Jetpack components.
* State management with StateFlow or MutableState and ViewModel to handle UI updates and state changes.
* Use of Kotlin Coroutines for reactive programming and handling asynchronous operations.
