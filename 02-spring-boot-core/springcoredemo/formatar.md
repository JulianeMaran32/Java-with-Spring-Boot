| Scope           | Description                                                 |
|:----------------|:------------------------------------------------------------|
| **singleton**   | Create a single share instance of the bean. Default scope.  |
| **prototype**   | Create a new bean instance for each container request.      |
| **request**     | Scoped to an HTTP web **request**. Only used for web apps.  |
| **session**     | Scoped to an HTTP web **session**. Only used for web apps.  |
| **application** | Scoped to a web app ServletContext. Only used for web apps. |
| **websocket**   | Scoped to a web socket. Only used for web apps.             |
