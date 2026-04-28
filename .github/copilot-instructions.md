# Copilot Workspace Instructions

## Mandatory Development Checklist
Run from socops using Maven Wrapper. Do not skip:

1. Lint: `./mvnw -q checkstyle:check`
2. Build: `./mvnw clean package`
3. Test: `./mvnw test`

## Project Context
- Soc Ops is a Spring Boot + Thymeleaf social bingo app.
- Main app module: socops.
- Docs/workshop content: docs, workshop.
- User-facing responses in this workspace should be in German.

## Run
```bash
cd socops
./mvnw spring-boot:run
```

Runtime defaults:
- App URL: http://localhost:8080
- Main template: src/main/resources/templates/game.html
- Main CSS utilities: src/main/resources/static/css/app.css

## Change Rules
- Keep edits focused; avoid unrelated refactors.
- Preserve naming and structure unless required by task.
- Reuse existing CSS utility classes before adding new ones.
- If behavior changes, add/update tests in src/test/java.

## Quick Welcome Tour
1. README.md for overview and commands.
2. workshop/01-setup.md for setup flow.
3. socops/src/main/java/com/socops/web/BingoRestController.java for API entry points.
4. socops/src/main/resources/templates/game.html for UI structure.
5. socops/src/main/resources/static/css/app.css for styling utilities.
