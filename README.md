# Quote of the Day App

This project is a simple JavaFX application that displays an inspiring quote every day. Users can refresh the quote, share it, and save their favorite quotes for later. 

## Features

- **Daily Quotes**: Shows a new inspiring quote each day.
- **Refresh Option**: Allows users to fetch a new quote on-demand.
- **Save Favorite Quotes**: Users can save their favorite quotes locally.
- **Share Quotes**: Users can share quotes via social media or messaging platforms.
- **Simple User Interface**: Designed with a clean, minimal UI for easy use.

## Project Structure

The project is organized into three main components:
- **`src/main`**: Contains all Java source files, including the main app logic and services.
- **`resources/database`**: Holds the SQLite database for storing saved quotes.
- **'build.gradle'**: Configuration file for managing dependencies and build settings.
  
QuoteApp/
├── src/
│   ├── main/
│   │   ├── App.java            # Main application entry point
│   │   ├── QuoteService.java   # Fetch quotes and store locally
│   │   ├── DatabaseHelper.java # Database handling
│   │   ├── views/
│   │   │   ├── HomeScreen.java # Home screen with quote display
│   │   │   └── FavoritesScreen.java # Favorites screen
├── resources/
│   └── database/
│       └── quotes.db           # SQLite database
└── build.gradle                # Build file for JavaFX, SQLite, and dependencies


## Installation

1. Clone this repository.
   ```bash
   git clone https://github.com/B8ng9/QuoteOfTheDay.git
   ```
2. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).
3. Ensure you have JavaFX and SQLite dependencies installed.

## Running the Application

Run the main class `App.java` located in `src/main`. This will launch the application window where you can see and interact with the "Quote of the Day" app.

## Dependencies

- **JavaFX**: For the graphical interface.
- **SQLite**: For storing saved quotes.
- **Gson**: To handle JSON data from the quote API.

## Future Improvements

- Add more customization options for the UI.
- Implement sorting and searching for saved quotes.
- Enable offline access to previously viewed quotes.

## License

This project is open-source and free to use for personal or educational purposes.

---
