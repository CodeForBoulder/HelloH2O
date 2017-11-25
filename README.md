```
 __          ___       __     
/\ \       /'___`\   /'__`\   
\ \ \___  /\_\ /\ \ /\ \/\ \  
 \ \  _ `\\/_/// /__\ \ \ \ \
  \ \ \ \ \  // /_\ \\ \ \_\ \
   \ \_\ \_\/\______/ \ \____/
    \/_/\/_/\/_____/   \/___/

```

# 🍜 Minimal Viable Product 🏔
_____________________________

## Resources:
- [TrelloBoard](https://trello.com/b/kl3gHU9R/code-for-boulder-water-everywhere)
- [Google Drive](https://drive.google.com/drive/folders/0BwBJbIQ_4ZdSS2t0bWdTTUwwcVU)
- [Mobile WireFrames](https://balsamiq.cloud/s2lq4/p3e5a/r2278)

### Project Scope:

Personal, Watershed, and Community impact

> We have three sections on Trello for creating, doing, and completing stories. As we decide and work through each it should contain a checklist of easily achievable tasks/byte-sized pieces. You can add your name to a story if you start working on it. The current Stack is Node.js Express Swift and PostgreSQL. Can always shift based on what people know and how we can integrate skills. Ultimately keeping things simple is great for getting to V1 quickly and building the foundation. The idea is to create something scalable to be the next big app.

## GitWorkflow and Topic Branching:
  - If you are taking on a story then $`git checkout -b {branch_name}`/only push to master if we are all on the same page
  - Merge it and communicate if there is overlapping code


# Stack (communicate with the group leaders)

Node.js:

  - Node.js is the largest ecosystem of packages of any asynchronous network based library.

Express:

  - Express to act as the framework for routes/endpoints, custom logic and auth, and error-handling middleware.

PostgreSQL:

  - Relational database to make table-resource connections and bindings.

React/React-Native:

  - One of the biggest advantages is that it provides a virtual DOM and only injects what's needed with less processes running in the background.

Gradle:

  - A Native build system running on top of the Java Virtual Machine.


Backend Stories:

  - Entity Relational Diagram of tables
  - Create test and development DB locally
  - Create Unit tests
  - Generate an Express Environment
  - Migrations and Tables
  - Build routes, models, and controllers
  - run localhost and check req-res for GET POST PUT PATCH and DELETE
  - Deploy

Auth:

- Will be good to implement some middleware or admin logic to build levels of access to certain components.
- Building a single DB in production to start and then talking about implementing different ways to store info to get something working now and then gradually increase security.
- CRUD User
  - Does the new User exist?
  - What constitutes a User?
  - Are you going to have some other form of identification required besides basic email/password pre-populated before an account is created?
  - Error responses?
  - What users will have access to what resources

Frontend Stories:

  - Get a BoilerPlate going
    - make `src` directory
    - eject if there are presets
    - add babel-legacy-transpiler
    - config the WebPack environment
    - register a service worker to handle immediate chaching
  - Add the store for all props
  - Create a root component
  - Create sub-components

## Contributors:
- Laura Quam
- Danielle Eliser
- Don Dulchinos
- Joshua Eliser
- Andrew Eskenazi
- ....
