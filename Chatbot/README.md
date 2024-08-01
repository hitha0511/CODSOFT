
# ChatBot🤖

This is a simple rule-based ChatBot application built using Python and Tkinter. The ChatBot responds to user inputs based on predefined patterns and can handle basic queries and conversations.

## Features

- User-friendly interface with a chat display area and input field.
- Use if-else statements  to identify user queries and provide appropriate responses
- Basic conversational abilities including greetings, farewells, and simple queries.
- Rule-based responses using regular expressions.


## Installation

1. Clone the repository:

```bash
  git clone https://github.com/<yourusername>/chatbot.git
```
2. Navigate to the project directory:

```bash
  cd chatbot
```
3. Install the required packages (Tkinter is included with Python standard library):
```sh
  pip install tkinter
```
## Usage

1. Run the `chatbot.py` file:
    ```sh
    python chatbot.py
    ```
2. A ChatBot window will open. You can start chatting by typing your message in the input field and pressing the "Send" button.

## Code Explanation

- **ChatBoxApp Class**: This class handles the creation of the Tkinter GUI and the logic for sending and receiving messages.
  - `create_widgets()`: Initializes the chat display area, user input field, and send button.
  - `send_message()`: Handles the sending of user messages and the display of ChatBot responses.
  - `display_message()`: Displays messages in the chat display area.
  - `chatbot_response()`: Contains the logic for generating responses based on user input using regular expressions.


## Example
#### Here is a sample interaction with the ChatBot:
***You👩‍💻***: Hello

***Chatbot🤖***: Hello! How can I assist you today?

***You👩‍💻***: What is your name?

***Chatbot🤖***: I am an AI chatbot created to assist you with basic queries and I was created by Hitha

***You👩‍💻***: Goodbye

***Chatbot🤖***: Goodbye! Have a great day!
## Contributing

Contributions are always welcome! 
Please feel free to submit a Pull Request or open an Issue if you have any suggestions or improvements.



## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
[MIT](https://github.com/hitha0511/CODSOFT?tab=MIT-1-ov-file)



## Authors
Hitha

Feel free to chat with the ChatBot and explore its capabilities!

