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

## Design Guide

### Theme
The app uses a **Cyberpunk Dark** aesthetic:
- **Background**: `--dark-bg: #0a0e27` (deep navy-black), `--dark-bg-secondary: #1a1f3a` (component surfaces)
- **Neon Accents**: `--neon-cyan: #00d9ff` (primary), `--neon-pink: #ff1493` (highlights/alerts), `--neon-lime: #39ff14` (success/marked)
- **Text**: `--text-primary: #ffffff`, `--text-secondary: #b0b8c8`
- **Font**: `'Courier New', 'Courier', monospace` — monospace throughout for techno feel

### Key CSS Utilities (Dark Theme)
| Class | Purpose |
|---|---|
| `bg-dark` | Page/section background |
| `bg-dark-secondary` | Cards, headers, tiles |
| `text-neon-cyan` | Primary headings and interactive labels |
| `text-neon-pink` | Alerts, "How to play" titles, victory text |
| `text-neon-lime` | Success states, checkmarks |
| `text-secondary` | Body text, subtitles |
| `border-neon-cyan` | Default tile and card borders |
| `border-neon-pink` | Victory/alert borders |
| `glow-cyan` | Neon glow on primary elements |
| `glow-pink` | Neon glow on victory/alert states |
| `glow-lime` | Neon glow on selected/success tiles |

### Tile States (Bingo Grid)
- **Unselected**: `bg-dark-secondary border-neon-cyan text-secondary glow-cyan`
- **Selected (normal)**: `border-neon-lime text-neon-lime glow-lime`
- **Selected (winning streak)**: `border-neon-pink text-neon-pink glow-pink`
- **Free cell**: same as selected (normal) + `font-bold`

### Design Principles
- Commit to neon-on-dark contrast; never mix light bg-white sections with dark theme.
- Glow effects (`box-shadow`) are the primary way to indicate interactive/active state.
- Add new utilities to `app.css` following the existing pattern; use CSS variables for any new colors.

## Quick Welcome Tour
1. README.md for overview and commands.
2. workshop/01-setup.md for setup flow.
3. socops/src/main/java/com/socops/web/BingoRestController.java for API entry points.
4. socops/src/main/resources/templates/game.html for UI structure.
5. socops/src/main/resources/static/css/app.css for styling utilities.
