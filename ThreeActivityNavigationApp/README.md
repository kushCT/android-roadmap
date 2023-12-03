# Android Application with Multiple Activities

## Project Structure

### MainActivity (`activity_main.xml`):
- Main activity of the application.
- Contains a button (`btnNext`) to navigate to the next activity.

### SecondActivity (`activity_second.xml`):
- Second activity opened when the button in `MainActivity` is clicked.
- Contains a button to navigate to the third activity.

### ThirdActivity (`activity_third.xml`):
- Third and final activity opened when the button in `SecondActivity` is clicked.

## Layout Files

- **`activity_main.xml`:**
  - Simple layout with a `RelativeLayout` containing a button (`btnNext`).
  - The button is centered in the parent layout.

- **`activity_second.xml` and `activity_third.xml`:**
  - Similar to `activity_main.xml`, each containing a button for navigation.

## Java Files

- **MainActivity.java:**
  - Sets the content view to `activity_main.xml`.
  - Retrieves the button (`btnNext`) from the layout.
  - Sets a click listener on the button to start `SecondActivity` when clicked.

- **SecondActivity.java and ThirdActivity.java:**
  - Similar to `MainActivity.java`.
  - Handle button clicks to navigate to the next activity in the sequence.

## Navigation

- **Intent:**
  - Used to navigate between activities.
  - In the `onClick` method of each button, an `Intent` is created to start the next activity.

- **Manifest (`AndroidManifest.xml`):**
  - All activities are declared in the manifest file to let the system know about them.
  - `MainActivity` is set as the launcher activity.

## How to Run

- Connect an Android device or use an emulator.
- Open the project in Android Studio.
- Build and run the project.
- The app will launch, and clicking the "Next Activity" buttons will navigate through the activities.

## Demo video
- [Demo Video](../Demo/ThreeActivityNavigationAppDemo.gif) for a live demonstration of the project.
