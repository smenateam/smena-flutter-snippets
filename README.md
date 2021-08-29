# Smena Flutter Snippets

![Build](https://github.com/smenateam/smena-flutter-snippets/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/17494-smena-flutter-snippets.svg)](https://plugins.jetbrains.com/plugin/17494-smena-flutter-snippets)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/17494-smena-flutter-snippets.svg)](https://plugins.jetbrains.com/plugin/17494-smena-flutter-snippets)

<!-- Plugin description -->
Плагин для IDEA/Android Studio, целью которого является ускорение и стандартизация типовых блоков в проекте.

<!-- Plugin description end -->

## Live templates

### sc
Создает GetController

### ss
Создает GetService

### sr
Создает Repository

### sf
Создает Freezed

### sm
Создает Model

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "smena-flutter-snippets"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/smenateam/smena-flutter-snippets/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


## TODO
- [x] Собрать плагин, протестировать локально, опубликовать его в store
- [ ] Добавить примеры live templates
- [ ] Добавить возможность создавать модули с необходимой структурой https://plugins.jetbrains.com/plugin/15919-getx

## Материалы
* [Инструкция](https://plugins.jetbrains.com/docs/intellij/template-support.html#implement-templatecontexttype) по добавлению Live Templates в IDEA плагин
* https://plugins.jetbrains.com/plugin/14975-getx-snippets
* https://plugins.jetbrains.com/plugin/15919-getx

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
