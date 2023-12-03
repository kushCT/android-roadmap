## Activity Lifecycle Methods:

1. **`onCreate(Bundle savedInstanceState)`:**
   - Called when the activity is first created.
   - Initialize essential components, setup UI, or restore previous state from the `savedInstanceState` bundle.

2. **`onStart()`:**
   - Called when the activity becomes visible to the user.
   - Perform actions like starting animations, acquiring resources, or registering receivers.

3. **`onResume()`:**
   - Called when the activity is about to become interactive.
   - Start animations, acquire resources that were released in `onPause`, and register necessary components.

4. **`onPause()`:**
   - Called when the activity is going into the background but is still partially visible.
   - Release resources that are unnecessary to keep running in the background.

5. **`onStop()`:**
   - Called when the activity is no longer visible to the user.
   - Release resources, save data, or perform cleanup.

6. **`onDestroy()`:**
   - Called when the activity is being destroyed.
   - Release all resources, unregister receivers, and perform final cleanup.

7. **`onRestart()`:**
   - Called when the activity is restarting after being stopped.
   - Prepare the activity to be restarted, initialize components, and acquire resources.

---

## Fragment Lifecycle Methods:

1. **`onAttach(Context context)`:**
   - Called when a fragment is attached to an activity.
   - Use this to perform setup related to the parent activity.

2. **`onCreate(Bundle savedInstanceState)`:**
   - Similar to the activity's `onCreate`, it's called when the fragment is created.
   - Initialize essential components, setup UI, or restore previous state from the `savedInstanceState` bundle.

3. **`onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)`:**
   - Create the fragment view hierarchy.
   - Inflate the layout, initialize UI components, and return the root view.

4. **`onActivityCreated(Bundle savedInstanceState)`:**
   - Called when the activity's `onCreate` has completed.
   - Use this to access and interact with the activity.

5. **`onStart()`:**
   - Similar to the activity's `onStart`, it's called when the fragment becomes visible.
   - Start animations, acquire resources, or register receivers.

6. **`onResume()`:**
   - Similar to the activity's `onResume`, it's called when the fragment is about to become interactive.
   - Start animations, acquire resources, or register necessary components.

7. **`onPause()`:**
   - Similar to the activity's `onPause`, it's called when the fragment is going into the background.
   - Release resources or perform cleanup.

8. **`onStop()`:**
   - Similar to the activity's `onStop`, it's called when the fragment is no longer visible.
   - Release resources, save data, or perform cleanup.

9. **`onDestroyView()`:**
   - Called when the fragment's UI is being destroyed.
   - Clean up resources related to the UI.

10. **`onDestroy()`:**
    - Called when the fragment is being destroyed.
    - Release all resources, unregister receivers, and perform final cleanup.

11. **`onDetach()`:**
    - Called when the fragment is detached from its hosting activity.
    - Perform cleanup related to the hosting activity.
