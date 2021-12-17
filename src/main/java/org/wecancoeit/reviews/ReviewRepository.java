package org.wecancoeit.reviews;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewRepository {


    Map<Long, Review> reviewsList = new HashMap<>();


    public ReviewRepository(){
        Review haikyuReview = new Review(1L, "Haikyu!!!", "images/etienne-girardet-xcqvnppPxI4-unsplash.jpg", "Review Category: Anime", "Haikyu!!! Is an Japanese anime that follows" +
                "Hinata and his Volleyball teammates as they move through play and train to become the best high school volley ball to in Japan! ",
                "I love this show! It's funny but also a great story of being  team" + "and looking pass your past and moving on and changing " +
                        "for the betterment of yourself and the team!" , "02-Mar-2020","Photo by Etienne Girardet on Unsplash");

        Review demonSlayerReview = new Review(2L, "Demon Slayer", "images/jase-bloor-oCZHIa1D4EU-unsplash.jpg", "Review Category: Anime", "Kamado Tanjiro was a normal cole burner until his family was slayed by a the" +
                "demon named Kibutsuji Muzon . This leaves Tanjior with his only serving sibling, Nezuko, who Kibutsuji turned into a demon. With her in tow inside a wooden box on his back, Tanjor and his sister set out" +
                "on a journey to slay demons and get revenge on Kibutsuji while also searching for a way to turn his sister back into a human. ",
                "The perfect mix of serious and seriously funny! (Expect for that annoying Zenitsu. The boi is a great fighter when unconscious, but in the waking hours he's just so whinny and annoyingly loud! " +
                        "Can't wait for his character development kick in).", "30-May-2020","Photo by Jase Bloor on Unsplash");

        Review sevenDeadlySinsReview = new Review(3L, "Seven Deadly Sins", "images/patrick-baum-oQTl_mHd2Ik-unsplash.jpg", "Review Category: Anime", "This show follows Seven Knights as they fight back demons to save their kingdom ",
                "I love the action and the plot but I LOVE THE LOVE!!! Especially between Meliodas abd Elizabeth! They go through so much! 😫 Elaine and Ban too! They were just to cute. Ban with his" +
                        "bad boy self and Elaine with her cute, sweet but strong self. Though I will say, the ending was....I will not say meh but there was a lot left out. I mean what is to happen with Merlin, King Author" +
                        "and Chaotic? Also, WHY DID THEY HAVE TO DO THAT TO CATH!!!! I LIKED HIM SO MUCH!!!! Anyway, it's really good despite those little part. Would totally focus my friends to watch this!",
                "28-Jun-2020","Photo by Patrick Baum on Unsplash");

        Review sailorMoonReview = new Review(4L, "SailorMoon", "images/altinay-dinc-LluELtL5mK4-unsplash.jpg", "Review Category: Anime", "Usagi Tsukino was normal girl with normal dreams of one day becoming married and having a family!...Until a talking Black Cat tells " +
                "her she is Sailor Moon, leader of the Sailor Guardians who protect the Galaxy from Darkness! Her world is then turned upside down as she tries to balance being the protector of the Galaxy and a normal middle school girl!",
                "SailorMoon has been an anime I have grown up with as a child and has inspired many stories I have created. It got everything I love from romance and action to cute and funny moments. There are also some really gripping and" +
                        "dramatic moments in this as well. My only grip is with the many character, Usagi Tsukino. She is and strong girl who does her best to save the world and her friend, but she tends to be too childish sometimes. There are many moments in both the old and the new" +
                        "anime that I wished the writers wouldn't make her at as if she is six. It funny when a character is a little bit childish but they make her just over the top in my opinion. However, I still love her because she reminds me a little bit of myself. She funny and cute" +
                        "and pouty like me...I'm just not as childish 😅.", "01-Jul-2020","Photo by Altınay Dinç on Unsplash");

        Review jujutsuKaisen = new Review(5L, "Jujutsu Kaisen", "images/andrei-caliman-0vUimYhadto-unsplash.jpg", "Review Category: Anime", "Yuji Itadori, a kid with amazing athletic abilities, only wanted to join the Mystery club. How did he end up at school late at night " +
                "witnessing as one of fellow club members is nearly eating by a monster some random kid trying to saver her called a curse? He doesn't know. What he does know is that his friend needs help and does everything he can to save her. Little did he " +
                "expect that this would end up with him eating the finger of a dead jujutsu sorcerer named the King of Curse, Sukuna. This will lead him into the world of Jujutsu sorcerers and curses to finding all 20 of Sukuna's finger in order to resurrect and kill" +
                "the King of Curses.",
                "This show goes HARD! Love the action scenes in this! I also think story is every interesting. So Itador has to eat all of Sukuna's fingers in order to resurrect the spirt and then kill him! It's got a touch of cliché in it but I have never been one to" +
                        "care about clichés. The detail is all I really care about and that little bit of uniqueness is nice. However, the GOAT of this whole thing is Satoru Gojo! Not only is he hot with his snow white hair and ice blue eyes but he is just totally BAD...a word I can not say" +
                        "because CLiff has stated I need to keep this PG. But the man in his control of \"infinity\" is just so cool! I can not wait for the next season!!!!😆", "28-Dec-2020","Photo by Andrei Caliman on Unsplash");

        reviewsList.put(haikyuReview.getId(), haikyuReview);
        reviewsList.put(demonSlayerReview.getId(), demonSlayerReview);
        reviewsList.put(sevenDeadlySinsReview.getId(), sevenDeadlySinsReview);
        reviewsList.put(sailorMoonReview.getId(), sailorMoonReview);
        reviewsList.put(jujutsuKaisen.getId(), jujutsuKaisen);
    }

    public ReviewRepository(Review ...reviewToAdd) {
        for(Review review: reviewToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();

    }

    public void save (Review x){
        reviewsList.put(x.getId(),x);
    }
}
