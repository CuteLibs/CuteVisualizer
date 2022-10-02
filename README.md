# CuteVisualizer


[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
 [![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21) [![JitPack](https://img.shields.io/jitpack/v/github/ahmmedrejowan/CuteVisualizer)](https://jitpack.io/#ahmmedrejowan/CuteVisualizer) [![GitHub license](https://img.shields.io/github/license/ahmmedrejowan/cutevisualizer)](https://github.com/ahmmedrejowan/CuteVisualizer/blob/master/LICENSE)  
 
 
[![GitHub forks](https://img.shields.io/github/forks/ahmmedrejowan/CuteVisualizer)](https://github.com/ahmmedrejowan/CuteVisualizer/network) [![GitHub issues](https://img.shields.io/github/issues/ahmmedrejowan/CuteVisualizer)](https://github.com/ahmmedrejowan/CuteVisualizer/issues) [![GitHub stars](https://img.shields.io/github/stars/ahmmedrejowan/CuteVisualizer)](https://github.com/ahmmedrejowan/CuteVisualizer/stargazers) [![GitHub contributors](https://img.shields.io/github/contributors/ahmmedrejowan/CuteVisualizer)](https://github.com/ahmmedrejowan/CuteVisualizer/graphs/contributors)

<img src="https://github.com/ahmmedrejowan/CuteVisualizer/blob/master/files/logo.jpg?raw=true" width="400px"/>


**A simple Music Visualizer/Equalizer View for Android**


## Purpose

**CuteVisualizer** is an Android Audio Visualizer Libaray

It's **open-source** and **free to use**. 
Give it a try.!

### Note:
- It's an auto visualizer
- It doesn't have anything to do with the music it's playing. 

## What's New
- **CuteVisualizer** First Release

More changes in `Release` Tab. 

## Specs
- Minimum SDK 21
- Target SDK 31
- AndroidX Library
- Gradle 7.0.4
- Java 11


## Screenshots

Click to View High Quality

<img src="https://github.com/ahmmedrejowan/CuteVisualizer/blob/master/files/Screenshot_1639779216.png?raw=true" width="400px"/>

<img src="https://github.com/ahmmedrejowan/CuteVisualizer/blob/master/files/Screenshot_1639779223.png?raw=true" width="200px"/> <img src="https://github.com/ahmmedrejowan/CuteVisualizer/blob/master/files/Screenshot_1639779256.png?raw=true" width="200px"/>

## Demo

Try Demo App to see how it actually works

<a href="https://github.com/ahmmedrejowan/CuteVisualizer/blob/master/files/demo.apk"><img src="https://github.com/ahmmedrejowan/CuteVisualizer/blob/master/files/try.png?raw=true" width="100px"/>
</a>





## Prerequisites

### Old Method

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

### New Method
Add this in your root `settings.gradle` file

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
        maven { url "https://jitpack.io" }
    }
}
```

<br/>

## Dependencies

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.ahmmedrejowan:CuteVisualizer:1.0'
}
```
<br/>

<br/>

## Usage

### XML 

``` XML


   <com.rejowan.cutevisualizer.CuteVisualizer
        android:id="@+id/equalizerView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="10dp"
        custom:animDuration="3000"
        custom:foregroundColor="@color/colorPrimary" />


```

#### Customization
Duration of Animation for Each Cycle

``` XML

        custom:animDuration="3000"

```

Change Colors for Bar (Only works with the colors from xml/colors.xml files color)

``` XML

        custom:foregroundColor="@color/colorPrimary"

```


### Java

##### Intialize
``` Java
        
	CuteVisualizer cuteVisualizer = findViewById(R.id.equalizerView);


```

##### Start Animate
``` Java
        
	cuteVisualizer.animateBars();


```
##### Stop Animate
``` Java
	
	cuteVisualizer.stopBars();


```
#### Status
``` Java
	
	cuteVisualizer.isAnimating();


```

##### Note
-  You can call `stopBars();` after initialization to stop them showing full size. 


<br/>


## Contribute

Please fork this repository and contribute back using [pull requests](https://github.com/ahmmedrejowan/CuteVisualizer/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

Let me know which features you want in the future in `Request Feature` tab. 

If this project helps you a little bit, then give a to Star ⭐ the Repo. 

<br/>


## Credits

Created with Love by **K M Rejowan Ahmmed** (@ahmmedrejowan)

Reach me @
* [Github](https://github.com/ahmmedrejowan) 
* [LinkedIn](https://www.linkedin.com/in/ahmmedrejowan)
* [Twitter](https://twitter.com/ahmmedrejowan)
* [Facebook](https://facebook.com/ahmmedrejowan)
* [StackOverFlow](https://stackoverflow.com/users/9932194/k-m-rejowan-ahmmed)




## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2021 K M Rejowan Ahmmed (ahmmedrejowan)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```
