# Smena Flutter Snippets

![Build](https://github.com/smenateam/smena-flutter-snippets/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Verify the [pluginGroup](/gradle.properties), [plugin ID](/src/main/resources/META-INF/plugin.xml) and [sources package](/src/main/kotlin).
- [x] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [x] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [x] Set the Plugin ID in the above README badges.
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [x] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

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
Создает freezed

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
