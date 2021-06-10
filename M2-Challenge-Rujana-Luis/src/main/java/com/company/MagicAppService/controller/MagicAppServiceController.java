package com.company.MagicAppService.controller;

import com.company.MagicAppService.model.Answer;
import com.company.MagicAppService.model.Quote;
import com.company.MagicAppService.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MagicAppServiceController {
    Random rand = new Random();
    int magicBallId = 1;
    //Mock Database
    private static List<Quote> quoteList= new ArrayList<>(Arrays.asList(
            new Quote(1, "Mother Teresa", "Spread love everywhere you go. Let no one ever come to you without leaving happier."),
            new Quote(2,"Eleanor Roosevelt", "The future belongs to those who believe in the beauty of their dreams."),
            new Quote(3, "Benjamin Franklin", "Tell me and I forget. Teach me and I remember. Involve me and I learn."),
            new Quote(4, "Abraham Lincoln", "In the end, it's not the years in your life that count. It's the life in your years."),
            new Quote(5, "John Lennon", "Life is what happens when you're busy making other plans."),
            new Quote(6, "Nelson Mandela", "The greatest glory in living lies not in never falling, but in rising every time we fall."),
            new Quote(7, "Marilyn Monroe","Keep smiling, because life is a beautiful thing and there's so much to smile about."),
            new Quote(8, "Dr. Seuss", "You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose."),
            new Quote(9, "Steve Jobs", "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma -- which is living with the results of other people's thinking."),
            new Quote(10, "Thomas A. Edison", "Many of life's failures are people who did not realize how close they were to success when they gave up.")
    ));

    private static List<Word> wordList = new ArrayList<>(Arrays.asList(
            new Word(1, "Kerfuffle", "To make a fuss or a bother"),
            new Word(2, "Hullaballoo", "The loud noises and shouting that people make when they’re angry"),
            new Word(3,"Cacophony", "A mixture of horrible sounds." ),
            new Word(4, "Ragamuffin", "A dirty and scruffy piece of old cloth."),
            new Word(5, "Whippersnapper", "A young person who’s too confident and perhaps a little cheeky!"),
            new Word(6, "Gobbledygook", "Words that are nonsense or have no meaning. It also describes when people use too many technical words and so other people can’t understand what they’e saying."),
            new Word(7, "Gibberish", "Nonsense words and phrases that sound like English but have little meaning."),
            new Word(8, "Flummox", "To confuse a person"),
            new Word(9, "Curmudgeon", "Someone who’s very bad-tempered and grumpy"),
            new Word(10, "Lackadaisical", "Someone’s lazy and has no enthusiasm or determination")
    ));

    private static List<String> answerList = new ArrayList<>(Arrays.asList(
            "Yes!",
            "Noooooo!",
            "Absolutely",
            "Definitely not!",
            "Probably",
            "Not sure...",
            "Ask again",
            "Sure, why not?",
            "You should",
            "You shouldn't",
            "Nope",
            "Yes, yes, yes!"
            //you get the idea...
    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Quote getQuote(){
        int randomQuoteIndex = rand.nextInt(quoteList.size());
         return quoteList.get(randomQuoteIndex);
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Word getWord(){
        int randomWordIndex = rand.nextInt(wordList.size());
        return wordList.get(randomWordIndex);

    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Answer getAnswer(@RequestBody Answer userInput){

        int randomAnswerIndex = rand.nextInt(answerList.size());
        String selectedAnswer = answerList.get(randomAnswerIndex);
        userInput.setAnswer(selectedAnswer);
        userInput.setId(magicBallId);
        magicBallId++;


        return userInput;
    }
}
