
# Book Recommender System

This repository contains a Book Recommender System built using a collaborative filtering approach with clustering. The system recommends books based on user ratings and can suggest similar books to a given book


## Project Overview

The Book Recommender System leverages user ratings data to suggest books that a user might like based on the preferences of similar users. The system uses the Nearest Neighbors algorithm to find books similar to the one selected by the user.

## Features

- ### Collaborative Filtering: 
   The system uses collaborative filtering to recommend books based on user ratings.
- ### Nearest Neighbors: 
   It employs the Nearest Neighbors algorithm to find and recommend books similar to a given book.
- ### Data Preprocessing: 
  The project includes steps to clean and prepare the data, such as filtering out infrequent users and books, and filling missing values.


## Data Sources

The data used in this project comes from the Book-Crossing dataset, which includes:
- Books: Metadata about books such as title, author, year of publication, and publisher.
- Users: Demographic data about users including location and age.
- Ratings: User ratings of books.

## Repository Contents

- 'BX-Books.csv': Contains information about books.
- 'BX-Users.csv': Contains information about users.
- 'BX-Book-Ratings.csv': Contains user ratings for books.
- 'artifacts/': Directory containing the saved models and data files.
    - 'model.pkl': The trained Nearest Neighbors model.
    - 'books_name.pkl': List of book titles.
    - 'final_rating.pkl': Final ratings data after preprocessing.
    - 'book_pivot.pkl': Pivot table of user ratings.
## Setup Instructions

### Prerequisites
- Python 3.x
- Required Python libraries: pandas, numpy, matplotlib, seaborn, scikit-learn

### Installation
1. Clone this repository:

```bash
  git clone https://github.com/hitha0511/CODSOFT/Book_Recommender_system.git
  cd Book_Recommender_system
```
2. Install the required Python libraries:
```bash
pip install -r requirements.txt
```
3. Place the dataset files ('BX-Books.csv', 'BX-Users.csv', 'BX-Book-Ratings.csv') in the 'data/' directory.

### Running the Code
1. Run the main script to preprocess data and build the model:
```bash
python book_recommender.py
```
2. Use the recommend_book function to get book recommendations. You can do this directly in the script or by importing the function into another script:
```bash
from book_recommender import recommend_book

book_name = 'Harry Potter and the Chamber of Secrets (Book 2)'
recommend_book(book_name)
```

## Example Usage
Here is an example of how to use the system to get book recommendations:
```bash
book_name = 'A Bend in the Road'
recommend_book(book_name)
```
This will output a list of books similar to 'A Bend in the Road'.

## Future Work
- Implementing content-based filtering to improve recommendation accuracy.
- Enhancing the user interface to allow easier interaction with the recommender system.
- Expanding the dataset to include more books and user ratings.

## Contributing

Contributions are always welcome!

Please feel free to submit a Pull Request.

## License

This project is licensed under the [MIT](https://github.com/hitha0511/CODSOFT/blob/main/LICENSE) License. See the LICENSE file for more details.


