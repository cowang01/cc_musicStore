Weekend Homework - Colin's Music Exchange

⭐️ This is a PDA Homework ⭐️

You are being asked to model a music shop. This shop will contain items which can be sold. These items might be instruments, which someone may play e.g. guitar, saxaphone, piano, etc, or, they might be other items, e.g. guitar strings, drum sticks, sheet music etc. Each item which can be sold will have both a price at which the shop bought the item, and a price at which the item will be sold.

You will need to:

Create a IPlay interface that could be applied to instruments. This should have a play method that returns the sound of the instrument being played as a String.

Create classes for different types of instruments e.g. guitars, pianos, etc. (any you can think of). Each class will have its own instance variables for attributes particular to that instrument e.g. a guitar may have a number of strings, a trumpet may have a number of valves etc.

Create an Instrument superclass which contains attributes you see as being common to all instruments e.g. material it is made from, colour, type (Brass, String, Woodwind, Keyboard etc). The classes created in step 2 above can then inherit from this Instruments class.

Create a ISell interface which has a calculateMarkup method, which returns an int/double, based on the buying price and the selling price.

Create classes for items the shop may sell, i.e. which implement the ISell interface. Such items should have the following:

a type/description e.g. guitar, drum sticks, guitar strings, sheet music etc.
a price at which the shop bought the item.
a price at which the shop plans to sell the item.
Some ISell items will be musical instruments i.e. instruments can be both IPlay and ISell.

Create a Shop class, which has a collection of ISell items, called stock. In your shop you should be able to:
add items to stock.
remove items from stock.
Possible Extensions

Using the calculateMarkup method for each item in stock, create a method which gives the total potential profit for the shop.
Create and use an enum for instrument types e.g. keyboard, wind, brass etc
Any other extensions you may wish to add.
Remember

Use TDD, with separate test files for each class.
