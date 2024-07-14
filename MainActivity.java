import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.GridLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView logoImageView;
    private Button signUpButton, signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoImageView = findViewById(R.id.logo_image);
        signUpButton = findViewById(R.id.sign_up_button);
        signInButton = findViewById(R.id.sign_in_button);

        // Add click listeners to buttons if needed
        signUpButton.setOnClickListener(view -> {
            // Handle sign up click
        });

        signInButton.setOnClickListener(view -> {
            // Handle sign in click
        });
    }
}



public class LoginActivity extends AppCompatActivity {

    private EditText usernameEmailEditText, passwordEditText;
    private Button signInButton;
    private TextView forgotPasswordTextView, signUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEmailEditText = findViewById(R.id.username_email_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        signInButton = findViewById(R.id.sign_in_button);
        forgotPasswordTextView = findViewById(R.id.forgot_password_text_view);
        signUpTextView = findViewById(R.id.sign_up_text_view);

        // Add click listeners to buttons and text views if needed
        signInButton.setOnClickListener(view -> {
            // Handle sign in click
        });

        forgotPasswordTextView.setOnClickListener(view -> {
            // Handle forgot password click
        });

        signUpTextView.setOnClickListener(view -> {
            // Handle sign up click
        });
    }
}


public class CreateAccountActivity extends AppCompatActivity {

    private EditText usernameEditText, emailEditText, passwordEditText, confirmPasswordEditText;
    private Spinner roleSpinner;
    private Button submitButton;
    private TextView signInTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        usernameEditText = findViewById(R.id.username_edit_text);
        emailEditText = findViewById(R.id.email_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        confirmPasswordEditText = findViewById(R.id.confirm_password_edit_text);
        roleSpinner = findViewById(R.id.role_spinner);
        submitButton = findViewById(R.id.submit_button);
        signInTextView = findViewById(R.id.sign_in_text_view);

        // Set up the spinner adapter with role options
        String[] roles = {"Teacher", "Mentor"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, roles);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        roleSpinner.setAdapter(adapter);

        // Add click listeners to buttons and text views if needed
        submitButton.setOnClickListener(view -> {
            // Handle submit click
        });

        signInTextView.setOnClickListener(view -> {
            // Handle sign in click
        });
    }
}


public class InterestsActivity extends AppCompatActivity {

    private GridLayout interestGrid;
    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        interestGrid = findViewById(R.id.interest_grid);
        continueButton = findViewById(R.id.continue_button);

        // Add buttons dynamically or programmatically
        // ...

        continueButton.setOnClickListener(view -> {
            // Handle continue button click
        });
    }
}



public class DashboardActivity extends AppCompatActivity {

    private Switch toggleSwitch;
    private ImageView userIcon, settingsIcon;
    private Button yourDashboardButton, viewCoursesButton, joinLiveSessionsButton, joinCommunityButton;
    private ProgressBar profileProgress;
    private ImageView placeholderImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toggleSwitch = findViewById(R.id.toggle_switch);
        userIcon = findViewById(R.id.user_icon);
        settingsIcon = findViewById(R.id.settings_icon);
        yourDashboardButton = findViewById(R.id.your_dashboard_button);
        profileProgress = findViewById(R.id.profile_progress);
        viewCoursesButton = findViewById(R.id.view_courses_button);
        placeholderImage = findViewById(R.id.placeholder_image);
        joinLiveSessionsButton = findViewById(R.id.join_live_sessions_button);
        joinCommunityButton = findViewById(R.id.join_community_button);

        // Add click listeners to buttons if needed
        viewCoursesButton.setOnClickListener(view -> {
            // Handle view courses click
        });

        // ... other button click listeners
    }
}
