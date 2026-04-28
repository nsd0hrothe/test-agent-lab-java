<div align="center">

🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

---

```
 ___  ___  ___     ___  ___  ___
/ __|| _ \/ __|   / _ \| _ \/ __| 
\__ \|   / (__   | (_) |  _/\__ \
|___/|_|_\\___|   \___/|_|  |___/
```

### **Social Bingo for Real People**

*Break the ice. Find your people. Shout BINGO.*

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=flat-square&logo=spring)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk)](https://adoptium.net/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)

**[▶ Start the Lab](workshop/GUIDE.md)** · **[Jump to Setup](workshop/01-setup.md)** · **[Run Locally](#run-it-locally)**

</div>

---

## What is Soc Ops?

Soc Ops turns awkward room-fillers into **genuine human connections**. It's a live Social Bingo webapp built with Spring Boot + Thymeleaf — each card is a 5×5 grid of icebreaker prompts. Walk the room, find matches, mark your card. First to five in a row wins.

> Built as a hands-on GitHub Copilot workshop: you don't just play the game, you **build and extend it** using AI-assisted development.

---

## What You'll Build

| # | Stage | You'll learn |
|---|-------|-------------|
| [**00 — Overview**](workshop/00-overview.md) | Big picture & checklist | How the lab is structured |
| [**01 — Setup**](workshop/01-setup.md) | Context engineering | Copilot instructions & project config |
| [**02 — Design**](workshop/02-design.md) | Design-first frontend | Skills, UI iteration, Thymeleaf |
| [**03 — Quiz Master**](workshop/03-quiz-master.md) | Custom agent | Generating fun prompts with a persona |
| [**04 — Multi-Agent**](workshop/04-multi-agent.md) | Agent orchestration | TDD + multi-agent workflows |

> All guides are also available offline in the [`workshop/`](workshop/) folder.

---

## The Tech Stack

```
┌─────────────────────────────────────────────┐
│  Browser  →  Thymeleaf templates             │
│  REST API →  Spring Boot (BingoRestController)│
│  Logic    →  BoardAssembler + IcebreakerPrompts│
│  Style    →  Custom CSS (app.css)             │
└─────────────────────────────────────────────┘
```

---

## Run It Locally

**Prerequisites:** Java 21+ · Maven 3.9+ (or use the wrapper)

```bash
# Clone & start
cd socops
./mvnw spring-boot:run
```

Open [http://localhost:8080](http://localhost:8080) — your bingo card is waiting.

```bash
# Build a JAR
./mvnw clean package

# Run all tests
./mvnw test
```

---

## Project Layout

```
socops/src/main/
├── java/com/socops/
│   ├── data/          # Icebreaker prompt bank
│   ├── model/         # BingoCell, PlayPhase, WinningStreak
│   ├── service/       # BoardAssembler (card generation logic)
│   └── web/           # BingoRestController (API endpoints)
└── resources/
    ├── templates/     # game.html  (Thymeleaf)
    └── static/css/    # app.css
```

---

## Contributing

PRs welcome — see [CONTRIBUTING.md](CONTRIBUTING.md). Please follow the [Code of Conduct](CODE_OF_CONDUCT.md).

---

<div align="center">

*Deploys automatically to GitHub Pages on push to `main`.*

**[Start the workshop →](workshop/GUIDE.md)**

</div>
