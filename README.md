<h2 align="center"><b>StillFlap Game (2DGraphics Based)</b></h2>
<p align="center">
  <a href="https://github.com/macesdev/stillflap/">REPO OSS </a> -
  <a href="https://macesdev.github.io/macesdev/projects/stillflap/license">LICENSE</a> </br> </br>
  <b> Created by MacesDEV Foundation </b> </br>
  <b> All Rights Resevred </b>
<h4 align="center"></h4>

<h2> Project Details </h2>

> **Used Java SE Version :** 1.8 (amazon-corretto)
> 
> **Used IDE** : Eclpse IDE for Java Developers (2020-09)
>
> **Tested Platforms** : Canonical Ubuntu (21.04, based for GNOME 3.38.5), Microsoft Windows 10 (21H1)
>
> **Main Package** : org.macesdev.stillflap
>
> **Form Builder Plug-in** : <a href="https://marketplace.eclipse.org/content/windowbuilder">(release-latest)</a>
> 
> **Project Author** : Maces Games STUDIOS (behalf on macesdev), Muhammed Ali BULUT

<h2> Project Fİles & File Details </h2>

```
|-- org (package)
|   |-- macesdev (package)
|   |   |-- stillflap (package)
|   |   |   |-- assets (resource_folder)
|   |   |   |   |-- lang (lang_classes)
|   |   |   |   |   |-- en_US.java (English (United States) lang class)
|   |   |   |   |   |-- tr_TR.java (Türkçe (Türkiye TÜrkçesi) lang class)
|   |   |   |-- run.java (project_main_class)
|   |   |   |-- scenes (resource_folder)
|   |   |   |   |-- main (resource_folder)
|   |   |   |   |   |-- wBoot.java (startup_form)
|   |   |   |   |   |-- wDialog.java (configFile_notFound_errorDialouge)
|   |   |   |   |   |-- wSettings.java (settings_form)
|   |   |   |-- scripts (resource_folder)
|   |   |   |   |-- checkNewUpdates.java (check_new_updateS)
|   |   |   |   |-- languageSettings.java (generate_system_language_settings)
|   |   |   |   |-- setLanguageVeriable.java (create_config_file)

```
<h2> Supported Languages & Lang Fİle</h2>

Supported Languages : 
> Türkçe (Türkiye TÜrkçesi) (tr_TR)
> 
> English (United States) (en_US)

<h2> Language Sources (java_class)</h2>

tr_TR (only_class_veriables), 

```java
package org.macesdev.stillflap.assets.lang;

public class en_US {
	public static String checkForUpdates_level1 = "Checking for new updates.";
	public static String checkForUpdates_level2 = "Checking for new updates..";
	public static String checkForUpdates_level3 = "Checking for new updates...";
	public static String pressenter = "Press ENTER to Start Game";
	public static String version = "v1.0.1-dev";
}
```

en_US (only_class_veriables), 

```java
package org.macesdev.stillflap.assets.lang;

public class tr_TR {
	public static String checkForUpdates_level1 = "Yeni güncellemeler kontrol ediliyor.";
	public static String checkForUpdates_level2 = "Yeni güncellemeler kontrol ediliyor..";
	public static String checkForUpdates_level3 = "Yeni güncellemeler kontrol ediliyor...";
	public static String pressenter = "ENTER Tuşuna Basarak Oyunu Başlat";
	public static String version = "v1.0.1-dev";

}
```

<h2> In Game Screenshots </h2>

> loading_assets

![image](https://user-images.githubusercontent.com/70213359/134778470-9eaaa32a-b827-4a14-927b-f566acae2f76.png)

> setttings_menu

null
