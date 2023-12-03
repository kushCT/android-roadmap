# Android Application with Three Fragments

## Project Structure

### MainActivity:
- Main activity of the application.
- Manages the fragments and navigation between them.

### Fragments (FirstFragment, SecondFragment, ThirdFragment):
- Three fragments, each representing a section of the application.
- Each fragment contains a button to navigate to the next fragment.

## Layout Files

1. **`activity_main.xml`:**
   - Main layout file for the `MainActivity`.
   - Contains a `FrameLayout` to act as a container for fragments.
   - Includes a button (`btnNext`) for navigating to the next fragment.

2. **`fragment_first.xml`, `fragment_second.xml`, `fragment_third.xml`:**
   - Layout files for each fragment.
   - Each contains a `RelativeLayout` with a button (`btnNext`) for navigating to the next fragment.

## Java Files

1. **`MainActivity.java`:**
   - Manages the activity lifecycle and fragment transactions.
   - Initializes the first fragment (`FirstFragment`) on activity creation.
   - Listens for button clicks and dynamically replaces fragments based on the current fragment state.

2. **`FirstFragment.java`, `SecondFragment.java`, `ThirdFragment.java`:**
   - Fragment classes corresponding to the three sections of the application.
   - Include fragment-specific logic if needed.

## Navigation

1. **FragmentManager and FragmentTransaction:**
   - Used to manage and execute fragment transactions.
   - Dynamically replaces the content of the `FrameLayout` with the corresponding fragment.

2. **Button Click Handling:**
   - The "Next Fragment" button click is handled in `MainActivity`.
   - Switches between fragments based on the current fragment state.

## Layout Modification

1. **`activity_main.xml` Modification:**
   - Added a `FrameLayout` to act as a container for fragments.
   - Positioned the "Next Fragment" button at the bottom of the layout.

## How to Run

1. **Launch the App:**
   - Connect an Android device or use an emulator.
   - Open the project in Android Studio.
   - Build and run the project.

2. **Navigate Through Fragments:**
   - Click the "Next Fragment" button to move to the next fragment.
   - Observe the dynamic loading of fragments into the `FrameLayout`.

## Additional Notes

- Customize the layouts, buttons, and fragments according to your app's requirements.
- Consider adding fragment-specific functionality or features as needed.
