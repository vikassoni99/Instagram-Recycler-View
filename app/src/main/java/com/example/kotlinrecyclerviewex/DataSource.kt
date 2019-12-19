package com.example.kotlinrecyclerviewex

import com.example.kotlinrecyclerviewex.model.BlogPost

class DataSource{

    companion object{

        fun createDataSet():ArrayList<BlogPost>{
            val list=ArrayList<BlogPost>()

            list.add(
                BlogPost(
                    "No Caption Needed :) :) ",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://img.buzzfeed.com/buzzfeed-static/static/2017-12/22/1/asset/buzzfeed-prod-fastlane-01/sub-buzz-22884-1513923367-1.png?crop=592:439;0,0&downsize=800:*&output-format=auto&output-quality=auto",
                    "vkas_soni"
                )
            )

            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://img.buzzfeed.com/buzzfeed-static/static/2017-12/21/17/asset/buzzfeed-prod-fastlane-01/sub-buzz-8655-1513896773-6.png?downsize=800:*&output-format=auto&output-quality=auto",
                    "_akshay_nandwana"
                )
            )

            list.add(
                BlogPost(
                    "Interviewing a Web Developer and YouTuber",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                    "https://img.buzzfeed.com/buzzfeed-static/static/2017-12/22/1/asset/buzzfeed-prod-fastlane-02/sub-buzz-1928-1513922418-6.png?crop=513:560;0,0&downsize=800:*&output-format=auto&output-quality=auto",
                    "the_hasley_india"
                )
            )
            list.add(
                BlogPost(
                    "Freelance Android Developer (Vasiliy Zukanov)",
                    "Vasiliy has been a freelance android developer for several years. He also has some of the best android development courses I've had the pleasure of taking on Udemy.com.",
                    "https://img.buzzfeed.com/buzzfeed-static/static/2017-12/25/16/asset/buzzfeed-prod-fastlane-02/sub-buzz-4502-1514238434-1.jpg?downsize=800:*&output-format=auto&output-quality=auto",
                    "Steven"
                )
            )
            list.add(
                BlogPost(
                    "Freelance Android Developer, Donn Felker",
                    "Freelancing as an Android developer with Donn Felker.\\r\\n\\r\\nDonn is also:\\r\\n\\r\\n1) Founder of caster.io\\r\\n\\r\\n2) Co-host of the fragmented podcast (fragmentedpodcast.com).",
                    "https://img.buzzfeed.com/buzzfeed-static/static/2017-12/21/13/asset/buzzfeed-prod-fastlane-03/sub-buzz-12069-1513881888-3.png?downsize=800:*&output-format=auto&output-quality=auto",
                    "Richelle"
                )
            )
            list.add(
                BlogPost(
                    "Work Life Balance for Software Developers",
                    "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                    "https://img.buzzfeed.com/buzzfeed-static/static/2017-12/22/2/asset/buzzfeed-prod-fastlane-01/sub-buzz-25309-1513927451-1.png?downsize=800:*&output-format=auto&output-quality=auto",
                    "Jessica"
                )
            )
            list.add(
                BlogPost(
                    "Full Stack Web Developer - Nicholas Olsen",
                    "In this podcast I interviewed the Fullsnack Developer (AKA Nicholas Olsen).\\r\\n\\r\\nNicholas is many things. What I mean by that is, he's good at many things.\\r\\n\\r\\n1. He’s an entrepreneur\\r\\n\\r\\n2. Web developer\\r\\n\\r\\n3. Artist\\r\\n\\r\\n4. Graphic designer\\r\\n\\r\\n5. Musician (drums)\\r\\n\\r\\n6. Professional BodyBuilder.",
                    "https://img.buzzfeed.com/buzzfeed-static/static/2017-12/21/14/asset/buzzfeed-prod-fastlane-03/sub-buzz-13410-1513883496-9.png?downsize=800:*&output-format=auto&output-quality=auto",                    "Guy"
                )
            )
            list.add(
                BlogPost(
                    "Javascript Expert - Wes Bos",
                    "Interviewing a web developer, javascript expert, entrepreneur, freelancer, podcaster, and much more.",
                    "https://pbs.twimg.com/media/DCGNqa4UAAAOYnq?format=jpg&name=small",
                    "Ruby"
                )
            )
            list.add(
                BlogPost(
                    "Senior Android Engineer - Kaushik Gopal",
                    "Kaushik Gopal is a Senior Android Engineer working in Silicon Valley.\r\n\r\nHe works as a Senior Staff engineer at Instacart.\r\n\r\nInstacart: https://www.instacart.com/",
                    "https://img.buzzfeed.com/buzzfeed-static/static/2017-12/21/16/asset/buzzfeed-prod-fastlane-01/sub-buzz-4789-1513890227-1.png?downsize=800:*&output-format=auto&output-quality=auto",
                    "mitch"
                )
            )

            return list
        }
    }
}