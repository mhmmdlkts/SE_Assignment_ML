# Software Engineering Assignment 4

Implement the following machine learning application using google-colab. The task is to assess the
hand value for a hand of three poker cards given the following rules:
a. A hand consists of only three cards.
b. The value of an ace is 11. The value of a king, queen, and jack is 10. The value of all
other cards is equal to their numerical rank.
c. The values of the cards with the same suit are added up.
d. The hand value is the maximum over all suits.

Examples :

● ace(hearts), ten(spades), ten(hearts) -> 21
● 2(spades), 3(spades), jack(diamonds) -> 10
● 3(spades), 4(spades), 5(hearts) -> 7

Tasks:
1. Generate an appropriate amount of training and test data. Choose an appropriate encoding for
representing the cards. You can use a programming language of your choice.
2. Define and train a neural network for accomplishing the assessment of hand values. The goal is
to achieve high value accuracy.
