# Musician Income Calculator

An Android application that calculates the required gross income for musicians after accounting for all taxes and social security contributions. 
The app allows musicians to input their desired net income and automatically calculates the necessary gross income to achieve that target.

## Features

- **Net Income Calculation**: Enter the desired net income, and the app will calculate the gross income required after deducting taxes and social security contributions.
- **User-Friendly Interface**: Simple and intuitive layout for easy input and result display.
- **Dynamic Calculation**: Automatically adjusts calculations based on input to provide accurate results.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/musician-income-calculator.git
2. Open the project in Android Studio.
3. Build and run the app on an Android device or emulator.

### Alternatively, you can download and install the compiled `.apk` directly:
- The compiled application is available in the repository at `app/release/CalculatorMusicians.apk`.
- Transfer the `.apk` file to your Android device and install it manually.

## Usage

1. Enter the desired net income (clean amount after deductions) in the input field.
2. Press the "Пресметни" (Calculate) button.
3. The app will display the required gross income needed to achieve the entered net income after all deductions.

## Screenshots

![App Screenshot](app/screenshot/screenshot.png)

## Code Overview

### MainActivity.java

- The main activity contains the core logic for calculating the gross income.
- It handles user input and displays the calculated result.

### Layout Files

- **activity_main.xml**: Contains the layout for the main activity, including input fields, buttons, and result display.
- **vector_drawables**: Custom vector assets used in the app.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or features you'd like to see.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
