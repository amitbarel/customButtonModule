# Custom Button Module for Android

## Overview

The Custom Button Module provides an easy way to create customizable buttons in Android. It allows
you to define button attributes such as corner radius, background color, outline color, and stroke
width via XML or programmatically. This module is especially useful for creating a consistent button
style across your application.

## Features

- Customizable corner radius
- Customizable background color
- Customizable outline color and stroke width
- Easy integration with XML layout files
- Programmatic customization at runtime

## Getting Started

### Prerequisites

- Android Studio
- Basic knowledge of Android development and XML

### Installation

#### Include the Module in Your Project

1. **Add the custom button module to your project:**

    - Copy the `customButtons` directory to the `libraries` directory in your project (or any
      preferred location).

2. **Add the module as a dependency in your app's build.gradle file:**
    ```
    dependencies {
        implementation ("com.github.amitbarel:customButtonModule:1.0.5")
    }
   ```

3. **Ensure Maven is configured in your settings.gradle file:**
    ```
    allprojects {
        repositories {
            google()
            mavenCentral()
            maven{url = uri("https://jitpack.io")}
        }
    }
   ```

### Usage

#### Use Custom Button in XML

Define your custom button in an XML layout file (activity_main.xml for example):

```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <com.example.custombuttonmodule.CustomButton
        android:id="@+id/custom_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Me"
        app:isOutlineButton="true"
        app:cornerRadius="12dp"
        app:customBackgroundColor="@android:color/holo_blue_light"
        app:outlineColor="@android:color/holo_red_light"
        app:strokeWidth="10dp"
        android:layout_centerInParent="true"/>
</RelativeLayout>
```

#### Or make the changes programmatically

```
CustomButton customButton = findViewById(R.id.custom_button);
        customButton.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Custom Button Clicked!", Toast.LENGTH_SHORT).show();
        });

        customButton.setOutlineButton(true);
        customButton.setCornerRadius(24f);
        customButton.setCustomBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        customButton.setOutlineColor(getResources().getColor(android.R.color.holo_blue_dark));
        customButton.setStrokeWidth(10f);
```

## Customization Options

### XML attributes

- **app:isOutlineButton** (boolean): Set to true to display the button with an outline.
- **app:cornerRadius** (dimension): Sets the corner radius of the button.
- **app:customBackgroundColor** (color): Sets the background color of the button.
- **app:outlineColor** (color): Sets the color of the outline.
- **app:strokeWidth** (dimension): Sets the width of the outline.

### Programmatic Customization

You can customize the button programmatically using the provided setter methods:

- **setOutlineButton** (boolean outlineButton)
- **setCornerRadius** (float radius)
- **setCustomBackgroundColor** (int color)
- **setOutlineColor** (int color)
- **setStrokeWidth** (float width)

## Conclusion

This custom button module provides a flexible and reusable way to create buttons with various styles
in your Android application. Customize the button using XML attributes or programmatically to fit
your design needs.

## Contributing

Amit Barel
