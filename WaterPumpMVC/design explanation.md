
Singleton Pattern

The Singleton pattern is used in the Database class to ensure that only one instance of the database connection exists throughout the application lifecycle. This prevents unnecessary multiple connections and provides a centralized access point to shared resources.

Benefit: Efficient resource management and consistent database access.

Factory Pattern

The Factory pattern is implemented through the PumpFactory class, which is responsible for creating pump objects. Instead of instantiating pump objects directly, the controller requests pump creation from the factory.

Benefit: Encapsulates object creation logic and allows easy extension if new pump types are added in the future.

Repository Pattern

The Repository pattern is used in the PumpRepository class to manage data access and storage of pump objects. It acts as an intermediary between the business logic and data source.

Benefit: Separates data access logic from business logic, improving testability and maintainability.
