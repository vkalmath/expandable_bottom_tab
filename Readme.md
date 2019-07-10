## Synopsis

Using Bottom Expandable Tab bar, user can create bottom tab bar for android with as many tabs as possible. Maximum tabs for each Tab Bar can be set.

sample can be checked at: https://www.youtube.com/watch?v=g0m01F7TfuI

## Code Example
Layout file:

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent" android:layout_height="match_parent">

    <com.vk.dev.android.ExpandableBottomTabBar
        android:id="@+id/tab_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:background="@android:color/white"
        app:max_tab_count="5"
        android:textSize="10sp"
        android:textColor="#454534"
        app:selected_tab_text_color="#FFFF0000"
        app:tab_resource="@xml/bottombar_tabs_five"
        app:more_icon_resource="@drawable/ic_more"
        />
</RelativeLayout>
```

create bottombar_tabs_five.xml under src/main/res/xml folder

```xml
<?xml version="1.0" encoding="utf-8"?>
<tabs>
    <tab
        id="@+id/tab_calendar"
        icon="@drawable/ic_cal"
        icon_pressed="@drawable/ic_cal_pressed"
        title="calendar" />
    <tab
        id="@+id/tab_file"
        icon="@drawable/ic_file"
        icon_pressed="@drawable/ic_file_pressed"
        title="file" />
    <tab
        id="@+id/tab_folder"
        icon="@drawable/ic_folder"
        icon_pressed="@drawable/ic_folder_pressed"
        title="folder" />
    <tab
        id="@+id/tab_home"
        icon="@drawable/ic_home"
        icon_pressed="@drawable/ic_home_pressed"
        title="home" />
</tabs>
```

Configurable Attributes
```
android:background="@android:color/white"
app:max_tab_count="5"
android:textSize="10sp"
android:textColor="#454534"
app:selected_tab_text_color="#FFFF0000"
app:tab_resource="@xml/bottombar_tabs_five"
app:more_icon_resource="@drawable/ic_more"

```

In Activity/Fragment

```
ExpandableBottomTabBar tabBarView = (ExpandableBottomTabBar) findViewById(R.id.tab_bar);

tabBarView.setOnTabClickedListener(new ExpandableBottomTabBar.OnTabClickedListener() {
    @Override
    public void onTabClicked(View view, int pos) {
        Toast.makeText(getApplicationContext(),
                "Clicked on Tab "+pos, Toast.LENGTH_SHORT).show();
    }
});
```

Video Demo
https://youtu.be/g0m01F7TfuI

## Motivation

In Bottom Tab bar we can have maximum 4 to 5 tabs. If tab count increases more than 5, then they look cramped if we try to fit them in
single tab bar. Other way is to have facebook style, where last tab can take to new screen which has list of other tabs.
If tabs are more than 5 and less than 8 then we can have them in two tab bars one below another. The other tab bar can be hidden, and can make it
appear on touching "more" tab on first tab bar.
Technically we can add as many tabs as possible. Depending on max number of tabs library will create the tab bars.

## Installation

expandablebottombar is created as android library project. Clone https://github.com/vkalmath/expandable_bottom_tab for details.

## Contributors

vkalmath.dev@gmail.com

icons used from: https://icons8.com/web-app/category/all/Very-Basic

inspiration from: https://github.com/roughike/BottomBar

## License

Copyright 2016 Veeresh Kalmath.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
