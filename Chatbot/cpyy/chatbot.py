import tkinter as tk
from tkinter import scrolledtext, Entry, Button
import re


class ChatBoxApp:
    def __init__(self, root):
        self.root = root
        self.root.title("ChatBot🤖")
        self.create_widgets()
        self.chatbot_response = self.chatbot_response  # reference to function

    def create_widgets(self):
        # Create a scrolled text widget to display chat messages
        self.chat_display = scrolledtext.ScrolledText(self.root, wrap=tk.WORD, height=30, width=40,bg='navy',fg='lightblue')
        self.chat_display.pack(padx=10, pady=10)


        # Create an entry widget for user input
        self.user_input = Entry(self.root, width=30, bg='seashell',fg='black')
        self.user_input.pack(padx=10, pady=5)

        # Create a button to send messages
        self.send_button = Button(self.root, text="Send", command=self.send_message, bg='lavender', fg='black')
        self.send_button.pack(pady=10)

    def send_message(self):
        user_message = self.user_input.get()
        self.display_message(f"You👤: {user_message}")
        response = self.chatbot_response(user_message)  # call chatbot_response function
        self.display_message(f"Chatbot🤖: {response}")
        self.user_input.delete(0, tk.END)

    def display_message(self, message):
        self.chat_display.insert(tk.END, message + "\n")
        self.user_input.delete(0, tk.END)


    def chatbot_response(self, user_input):
        # Convert the user input to lowercase to make the matching case-insensitive
        print("Feel free to chat with me!")
        user_input = user_input.lower()


        # Greeting responses
        if re.search(r'\bhello\b|\bhi\b|\bhey\b', user_input):
            return "Hello! How can I assist you today?"
        # Farewell responses
        elif re.search(r'\bbye\b|\bgoodbye\b|\bsee you\b', user_input):
            return "Goodbye! Have a great day!"
        # Simple conversation
        elif re.search(r'\bhow are you\b|\bhow are you doing\b', user_input):
            return "I'm just a program, but I'm functioning as expected! How about you?"
        # Query about the chatbot
        elif re.search(r'\bwho are you\b|\bwhat are you\b', user_input):
            return "I am a rule-based chatbot. How can I assist you?"
        elif re.search(r'\bwhat is your name\b|\bwho created you\b', user_input):
            return "I am an AI chatbot created to assist you with basic queries and I was created by Hitha"
        elif re.search(r'\bweather\b', user_input):
            return "I'm not equipped to provide real-time weather updates, but you can check the weather on your favorite weather website."
        # Unknown input response
        else:
            return "I'm sorry, I don't understand that. Can you please rephrase?"


if __name__ == "__main__":
    print("Feel free to chat with me!😇")
    root = tk.Tk()
    app = ChatBoxApp(root)
    root.mainloop()
