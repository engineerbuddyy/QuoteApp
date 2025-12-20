package com.example.quoteapp.data.source

import com.example.quoteapp.data.model.QuoteCategory
import com.example.quoteapp.data.model.QuoteModel

object QuoteData {
    fun getQuotes(): List<QuoteModel> = listOf(

        // --- DOSTOEVSKY (1–10)
        QuoteModel(
            1,
            "The soul is healed by being with children.",
            "Fyodor Dostoevsky",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            2,
            "To live without hope is to cease to live.",
            "Fyodor Dostoevsky",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            3,
            "Pain and suffering are always inevitable for a large intelligence and a deep heart.",
            "Fyodor Dostoevsky",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            4,
            "The mystery of human existence lies not in staying alive, but in finding something to live for.",
            "Fyodor Dostoevsky",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            5,
            "It is not the brains that matter most, but that which guides them — the character, the heart, generous qualities.",
            "Fyodor Dostoevsky",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(6, "Man is what he believes.", "Fyodor Dostoevsky", QuoteCategory.PHILOSOPHY),
        QuoteModel(
            7,
            "Taking a new step, uttering a new word, is what people fear most.",
            "Fyodor Dostoevsky",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            8,
            "Love in action is a harsh and dreadful thing compared with love in dreams.",
            "Fyodor Dostoevsky",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            9,
            "It is better to be with God and alone than to be with people and without God.",
            "Fyodor Dostoevsky",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            10,
            "The degree of civilization in a society can be judged by entering its prisons.",
            "Fyodor Dostoevsky",
            QuoteCategory.PHILOSOPHY
        ),

        // --- NIETZSCHE (11–25)
        QuoteModel(
            11,
            "He who has a why to live can bear almost any how.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            12,
            "That which does not kill us makes us stronger.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            13,
            "There are no facts, only interpretations.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            14,
            "To live is to suffer, to survive is to find some meaning in the suffering.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            15,
            "No price is too high to pay for the privilege of owning yourself.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            16,
            "He who cannot obey himself will be commanded.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            17,
            "The higher we soar, the smaller we appear to those who cannot fly.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            18,
            "Sometimes people don’t want to hear the truth because they don’t want their illusions destroyed.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            19,
            "In every real man, a child is hidden that wants to play.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(20, "Become who you are.", "Friedrich Nietzsche", QuoteCategory.PHILOSOPHY),
        QuoteModel(
            21,
            "The individual has always had to struggle to keep from being overwhelmed by the tribe.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            22,
            "Without music, life would be a mistake.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            23,
            "Invisible threads are the strongest ties.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            24,
            "Sometimes people don’t want to hear the truth because they don’t want their illusions destroyed.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            25,
            "One must still have chaos in oneself to give birth to a dancing star.",
            "Friedrich Nietzsche",
            QuoteCategory.PHILOSOPHY
        ),

        // --- KAFKA (26–40)
        QuoteModel(
            26,
            "Don't bend; don't water it down; don't try to make it logical; don't edit your own soul according to the fashion.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            27,
            "In the fight between you and the world, back the world.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            28,
            "A book must be the axe for the frozen sea within us.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            29,
            "Start with what is right rather than what is acceptable.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(30, "Paths are made by walking.", "Franz Kafka", QuoteCategory.PHILOSOPHY),
        QuoteModel(
            31,
            "You are free, and that is why you are lost.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            32,
            "I am a cage, in search of a bird.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            33,
            "Youth is happy because it has the capacity to see beauty. Anyone who keeps the ability to see beauty never grows old.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            34,
            "Everything that you love, you will eventually lose. But in the end, love will return in a different form.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            35,
            "One of the first signs of the beginning of understanding is the wish to die.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            36,
            "I am free and that is why I am lost.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            37,
            "A first sign of the beginning of understanding is the wish to die.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            38,
            "Every revolution evaporates and leaves behind only the slime of a new bureaucracy.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            39,
            "I have spent my life resisting the desire to end it.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            40,
            "Anyone who keeps the ability to see beauty never grows old.",
            "Franz Kafka",
            QuoteCategory.PHILOSOPHY
        ),

        // --- CAMUS (41–55)
        QuoteModel(
            41,
            "In the depth of winter, I finally learned that within me there lay an invincible summer.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            42,
            "The only way to deal with an unfree world is to become so absolutely free that your very existence is an act of rebellion.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            43,
            "Freedom is nothing else but a chance to be better.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            44,
            "You will never be happy if you continue to search for what happiness consists of.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            45,
            "Life is the sum of all your choices.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            46,
            "Don’t walk behind me; I may not lead. Don’t walk in front of me; I may not follow. Just walk beside me and be my friend.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            47,
            "Blessed are the hearts that can bend; they shall never be broken.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(48, "Integrity has no need of rules.", "Albert Camus", QuoteCategory.PHILOSOPHY),
        QuoteModel(
            49,
            "Autumn is a second spring when every leaf is a flower.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            50,
            "The struggle itself towards the heights is enough to fill a man's heart.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            51,
            "Nobody realizes that some people expend tremendous energy merely to be normal.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            52,
            "Fiction is the lie through which we tell the truth.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            53,
            "Man is the only creature who refuses to be what he is.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            54,
            "You cannot create experience. You must undergo it.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            55,
            "Real generosity toward the future lies in giving all to the present.",
            "Albert Camus",
            QuoteCategory.PHILOSOPHY
        ),

        // --- TOLSTOY (56–70)
        QuoteModel(
            56,
            "Everyone thinks of changing the world, but no one thinks of changing himself.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            57,
            "All happy families are alike; each unhappy family is unhappy in its own way.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            58,
            "The two most powerful warriors are patience and time.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(59, "If you want to be happy, be.", "Leo Tolstoy", QuoteCategory.PHILOSOPHY),
        QuoteModel(
            60,
            "Everyone thinks of changing humanity, but no one thinks of changing themselves.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            61,
            "True life is lived when tiny changes occur.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            62,
            "Respect was invented to cover the empty place where love should be.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            63,
            "All, everything that I understand, I understand only because I love.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            64,
            "Without knowing what I am and why I am here, life is impossible.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            65,
            "Happiness does not depend on outward things, but on the way we see them.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            66,
            "If you want to be happy, do not dwell on the past.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            67,
            "Wrong does not cease to exist because the majority shares in it.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            68,
            "Everyone thinks of changing the world, but no one thinks of changing himself.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            69,
            "The strongest of all warriors are these two — Time and Patience.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            70,
            "Without love, everything is nothing.",
            "Leo Tolstoy",
            QuoteCategory.PHILOSOPHY
        ),

        // --- ARISTOTLE (71–85)
        QuoteModel(
            71,
            "Knowing yourself is the beginning of all wisdom.",
            "Aristotle",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            72,
            "We are what we repeatedly do. Excellence, then, is not an act, but a habit.",
            "Aristotle",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            73,
            "The roots of education are bitter, but the fruit is sweet.",
            "Aristotle",
            QuoteCategory.EDUCATION
        ),
        QuoteModel(
            74,
            "Pleasure in the job puts perfection in the work.",
            "Aristotle",
            QuoteCategory.WISDOM
        ),
        QuoteModel(75, "Happiness depends upon ourselves.", "Aristotle", QuoteCategory.PHILOSOPHY),
        QuoteModel(
            76,
            "The energy of the mind is the essence of life.",
            "Aristotle",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            77,
            "Patience is bitter, but its fruit is sweet.",
            "Aristotle",
            QuoteCategory.PHILOSOPHY
        ),
        QuoteModel(
            78,
            "Educating the mind without educating the heart is no education at all.",
            "Aristotle",
            QuoteCategory.EDUCATION
        ),
        QuoteModel(
            79,
            "He who has never learned to obey cannot be a good commander.",
            "Aristotle",
            QuoteCategory.LEADERSHIP
        ),
        QuoteModel(
            80,
            "Courage is the first of human qualities because it is the quality which guarantees the others.",
            "Aristotle",
            QuoteCategory.COURAGE
        ),
        QuoteModel(
            81,
            "The law is reason free from passion.",
            "Aristotle",
            QuoteCategory.LEADERSHIP
        ),
        QuoteModel(
            82,
            "It is the mark of an educated mind to be able to entertain a thought without accepting it.",
            "Aristotle",
            QuoteCategory.EDUCATION
        ),
        QuoteModel(
            83,
            "Friendship is a single soul dwelling in two bodies.",
            "Aristotle",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            84,
            "Happiness is the meaning and the purpose of life, the whole aim and end of human existence.",
            "Aristotle",
            QuoteCategory.LIFE
        ),
        QuoteModel(85, "Hope is a waking dream.", "Aristotle", QuoteCategory.LIFE),

        // --- MOTIVATION (86–110)
        QuoteModel(
            86,
            "Everything you can imagine is real.",
            "Pablo Picasso",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            87,
            "You miss 100% of the shots you don't take.",
            "Wayne Gretzky",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            88,
            "Whether you think you can or you think you can't, you're right.",
            "Henry Ford",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            89,
            "The future belongs to those who believe in the beauty of their dreams.",
            "Eleanor Roosevelt",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(90, "Dream big and dare to fail.", "Norman Vaughan", QuoteCategory.MOTIVATION),
        QuoteModel(
            91,
            "Everything has beauty, but not everyone sees it.",
            "Confucius",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            92,
            "The only limit to our realization of tomorrow is our doubts of today.",
            "Franklin D. Roosevelt",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            93,
            "Hard times create strong men.",
            "G. Michael Hopf",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(94, "What we think, we become.", "Buddha", QuoteCategory.MOTIVATION),
        QuoteModel(
            95,
            "If you want to lift yourself up, lift up someone else.",
            "Booker T. Washington",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            96,
            "Great things are done by a series of small things brought together.",
            "Vincent van Gogh",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            97,
            "The best way out is always through.",
            "Robert Frost",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            98,
            "Start where you are. Use what you have. Do what you can.",
            "Arthur Ashe",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            99,
            "Don’t watch the clock; do what it does. Keep going.",
            "Sam Levenson",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(100, "Keep going. Be all in.", "Bryan Hutchinson", QuoteCategory.MOTIVATION),
        QuoteModel(
            101,
            "Success is liking yourself, liking what you do, and liking how you do it.",
            "Maya Angelou",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            102,
            "The way to get started is to quit talking and begin doing.",
            "Walt Disney",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            103,
            "Do not wait to strike till the iron is hot; but make it hot by striking.",
            "William Butler Yeats",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            104,
            "Quality is not an act, it is a habit.",
            "Aristotle",
            QuoteCategory.MOTIVATION
        ),
        QuoteModel(
            105,
            "Act as if what you do makes a difference. It does.",
            "William James",
            QuoteCategory.MOTIVATION
        ),

// --- LOVE (106–125)
        QuoteModel(
            106,
            "We accept the love we think we deserve.",
            "Stephen Chbosky",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            107,
            "Love all, trust a few, do wrong to none.",
            "William Shakespeare",
            QuoteCategory.LOVE
        ),
        QuoteModel(108, "Where there is love there is life.", "Mahatma Gandhi", QuoteCategory.LOVE),
        QuoteModel(
            109,
            "Love is composed of a single soul inhabiting two bodies.",
            "Aristotle",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            110,
            "The supreme happiness of life is the conviction that we are loved.",
            "Victor Hugo",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            111,
            "To love and be loved is to feel the sun from both sides.",
            "David Viscott",
            QuoteCategory.LOVE
        ),
        QuoteModel(112, "Love recognizes no barriers.", "Maya Angelou", QuoteCategory.LOVE),
        QuoteModel(
            113,
            "There is only one happiness in this life, to love and be loved.",
            "George Sand",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            114,
            "If you judge people, you have no time to love them.",
            "Mother Teresa",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            115,
            "Being deeply loved gives you strength; loving deeply gives you courage.",
            "Lao Tzu",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            116,
            "Love is when the other person's happiness is more important than your own.",
            "H. Jackson Brown Jr.",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            117,
            "Love is not about how many days, months, or years you have been together. Love is about how much you love each other every single day.",
            "Unknown",
            QuoteCategory.LOVE
        ),
        QuoteModel(118, "We are most alive when we're in love.", "John Updike", QuoteCategory.LOVE),
        QuoteModel(
            119,
            "Love is composed of a single soul inhabiting two bodies.",
            "Aristotle",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            120,
            "Love does not dominate; it cultivates.",
            "Johann Wolfgang von Goethe",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            121,
            "The greatest thing you'll ever learn is just to love and be loved in return.",
            "Nat King Cole",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            122,
            "Love is the only force capable of transforming an enemy into a friend.",
            "Martin Luther King Jr.",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            123,
            "Love is the bridge between you and everything.",
            "Rumi",
            QuoteCategory.LOVE
        ),
        QuoteModel(
            124,
            "Love is life. And if you miss love, you miss life.",
            "Leo Buscaglia",
            QuoteCategory.LOVE
        ),
        QuoteModel(125, "Where there is love, there is God.", "Mahabharata", QuoteCategory.LOVE),

// --- WISDOM (126–150)
        QuoteModel(
            126,
            "Knowing yourself is the beginning of all wisdom.",
            "Aristotle",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            127,
            "The only true wisdom is in knowing you know nothing.",
            "Socrates",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            128,
            "Wise men speak because they have something to say; fools because they have to say something.",
            "Plato",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            129,
            "Do what you can, with what you have, where you are.",
            "Theodore Roosevelt",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            130,
            "The journey of a thousand miles begins with one step.",
            "Lao Tzu",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            131,
            "Education is not the filling of a pail, but the lighting of a fire.",
            "William Butler Yeats",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            132,
            "Honesty is the first chapter in the book of wisdom.",
            "Thomas Jefferson",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            133,
            "The quieter you become, the more you can hear.",
            "Ram Dass",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            134,
            "He who knows, does not speak. He who speaks, does not know.",
            "Lao Tzu",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            135,
            "The greatest wealth is to live content with little.",
            "Plato",
            QuoteCategory.WISDOM
        ),
        QuoteModel(136, "What you seek is seeking you.", "Rumi", QuoteCategory.WISDOM),
        QuoteModel(
            137,
            "The mind is everything. What you think you become.",
            "Buddha",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            138,
            "Silence is a source of great strength.",
            "Lao Tzu",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            139,
            "Patience is the companion of wisdom.",
            "Saint Augustine",
            QuoteCategory.WISDOM
        ),
        QuoteModel(140, "Wisdom begins in wonder.", "Socrates", QuoteCategory.WISDOM),
        QuoteModel(
            141,
            "Knowing others is intelligence; knowing yourself is true wisdom.",
            "Lao Tzu",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            142,
            "To know oneself is the beginning of all wisdom.",
            "Aristotle",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            143,
            "The more I read, the more I acquire, the more certain I am that I know nothing.",
            "Voltaire",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            144,
            "A fool thinks himself to be wise, but a wise man knows himself to be a fool.",
            "William Shakespeare",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            145,
            "The essence of knowledge is, having it, to apply it; not having it, to confess your ignorance.",
            "Confucius",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            146,
            "The wise man does at once what the fool does finally.",
            "Niccolo Machiavelli",
            QuoteCategory.WISDOM
        ),
        QuoteModel(
            147,
            "An investment in knowledge pays the best interest.",
            "Benjamin Franklin",
            QuoteCategory.WISDOM
        ),
        QuoteModel(148, "Happiness depends upon ourselves.", "Aristotle", QuoteCategory.WISDOM),
        QuoteModel(
            149,
            "Educating the mind without educating the heart is no education at all.",
            "Aristotle",
            QuoteCategory.EDUCATION
        ),
        QuoteModel(
            150,
            "It is the mark of an educated mind to be able to entertain a thought without accepting it.",
            "Aristotle",
            QuoteCategory.WISDOM
        ),

        )
}