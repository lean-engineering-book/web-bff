# WEB-BFF
This is the [Backend For Frontend](https://samnewman.io/patterns/architectural/bff/) for our [Web Application](https://github.com/lean-engineering-book/web-frontend). This service is **tightly coupled** to our web application, and **MUST NOT** be used by any other client. In the words of Sam Newman:

> Conceptually, you should think of the user-facing application as being two components - a client-side application living outside your perimeter, and a server-side component (the BFF) inside your perimeter.

## Architectural Decision Record
We're using [Markdown Architectural Decision Records](https://adr.github.io/madr/) for this service. You can access the records on [this page](./docs/adr/index.md).