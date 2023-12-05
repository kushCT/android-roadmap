# Step 1: Setup Dependencies

```
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
implementation 'com.android.support:recyclerview-v7:28.0.0' // Use the version appropriate for your project
```

- Added dependencies in the build.gradle file.
- Retrofit: A library for making network requests and handling the API responses.
- Gson Converter: A converter for Retrofit that uses Gson for serialization and deserialization.
- RecyclerView: Android's official component for displaying lists efficiently.

# Step 2: Create Model Class (Photo class)

```
import com.google.gson.annotations.SerializedName;

public class Photo {
    @SerializedName("albumId")
    private int albumId;

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("url")
    private String url;

    @SerializedName("thumbnailUrl")
    private String thumbnailUrl;

    // Getters and setters
    // ...
}

```

- Created a Java class (Photo) to represent the structure of the data received from the API.
- Used @SerializedName annotations for mapping JSON keys to Java class fields.

# Step 3: Create Retrofit Service Interface (ApiService interface)
```
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("photos")
    Call<List<Photo>> getPhotos();
}
```
- Created a Retrofit service interface defining the API endpoints.
- Used @GET annotation to specify the HTTP method and endpoint.
#Step 4: Create RecyclerView Adapter (PhotoAdapter class)
```
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {
    // Adapter implementation
    // ...
}
```
- Implemented a RecyclerView adapter to manage the data and bind it to the views.
- Used Glide library for efficient image loading.

#Step 5: Create RecyclerView Item Layout (item_photo.xml)
```
<!-- res/layout/item_photo.xml -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="16dp">

    <ImageView
        android:id="@+id/photoImageView"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:scaleType="centerCrop"
        android:src="@drawable/placeholder_image" />

    <TextView
        android:id="@+id/titleTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        android:text="Photo Title"
        android:textSize="16sp" />

</LinearLayout>

```
- Defined the layout for each item in the RecyclerView.
- Included an ImageView for displaying images and a TextView for the title.

# Step 6: Update MainActivity
```
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    // MainActivity implementation
    // ...
}
```
- In the MainActivity, set up the Retrofit instance, create a service instance, and make a network request to fetch the data.
- Configured the RecyclerView, created an adapter, and set it on the RecyclerView to display the data.

# Step 7: Add Internet Permission

```
<uses-permission android:name="android.permission.INTERNET" />
```
- Added the internet permission to the AndroidManifest.xml file to allow the app to make network requests.
