Check out my profile: https://hyperskill.org/profile/405752989
# ASCII Mirror

ASCII Mirror is a Java application that reads ASCII art from a file and outputs a mirrored version of it. The application reads each line from the file, finds the longest string, and pads all other strings with spaces to match the length of the longest string. It then prints each line twice, separated by a vertical bar (`|`), with the second line being a mirrored version of the first line.

## Features

- Reads ASCII art from a file
- Outputs a mirrored version of the ASCII art
- Handles horizontally non-symmetrical characters by replacing them with their horizontally opposite chars: `<` to `>`, `[` to `]`, `{` to `}`, `(` to `)`, `/` to `\`, and vice versa.

## Usage

1. Run the application.
2. When prompted, input the file path of the ASCII art file.
3. The application will output a mirrored version of the ASCII art.

## Example

Input:

```
Input the file path:
> ./test/example1.txt
```

Output:

```
                    _______  |  _______                    
                   < hello > | > olleh <                   
                    -------  |  -------                    
            ^__^   /         | \   ^__^            
    _______/(oo)  /          | \  (oo)\_______    
/\/(       /(__)             | (__)\       )\/\
   | w----||                 | ||----w |   
   ||     ||                 | ||     ||
```

## Requirements

- Java 11 or later
- Gradle

## Building

To build the application, use the following command:

```
gradle build
```

## Running

To run the application, use the following command:

```
gradle run
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
