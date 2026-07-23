**Prompt [Now, agents don&#039;t just have to go and do... | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZHSTJZVGs0Wm1SbUxXWXpOakF0TkRjelpDMWhZMlE1TFdReU1EWm1ORFpsTUdZNU5Yd3lNREkyTFRBM0xUSXlWREExT2pNeU9qSTBMakl5TWpZM09UZGEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTIyVDA1OjMyOjIzLjk2NloifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
Now, agents don't just have to go and do everything one step at a time. ​They can actually go and build rich plans. ​And this is one of the capabilities that really underlies all this, ​is their ability to take a goal that you're trying to achieve, ​some high level task, and decompose it into a series of subtasks or ​goals in order to form a plan to accomplish it. ​And that is a fundamental capability. ​Now, one way that we can have agents work is we can have them go and interactively, ​one task at a time, go and take steps and perform actions and respond. ​And that's a really powerful way to do it. ​Another way that we can do it is the complete opposite. ​We can have it build out the whole plan in advance and then go and ​send it off to be executed. ​Now, we haven't gotten to the point of automating things yet, so ​let's do the planning where a human being is going to go and execute the whole plan. ​So here's my goal. ​Plan a four day trip to Nashville that involves going to several different ​neighborhoods. ​And it goes and it breaks down my task. ​It says, okay, I need four days worth of activities. ​They need to go to different neighborhoods. ​And it goes day one, downtown Nashville, breakfast at Pancake Pantry. ​I'm not sure this is accurate on neighborhoods, ​depending how you classify downtown Nashville. ​I think if downtown Nashville is not including the Pancake Pantry, ​I think of that as Hillsboro Village. ​But, you know, it did its best. ​And that's another thing, is it's not always going to be perfect. ​And when we go step by step, it has more ability to adapt and correct that. ​For example, it could have said, go to pancake pantry. ​I could say, that's not downtown according to my definition of downtown. ​It could have said, well, you've got a different definition of downtown than me. ​And it could have adapted its plan. ​And when we go and we generate the whole plan like that, it's in one go. ​It doesn't have the ability, necessity to adapt between steps. ​This is a key difference. ​And when we think about planning, if we do it step by step, ​full adaptation between it. ​But there's some complexity there, right? ​Because it may forget steps or it may lose track of what it was trying to do or ​something like that. ​On the other hand, we can go, we can have it so ​it never loses track of what it's going to do. ​It can build out the full plan in advance, and ​then it just gets sent off to execute multiple steps. ​And it doesn't have to remember what it said or ​anything like that makes it an advance. ​But if there's a flaw in the plan, it doesn't get to adapt the plan while it's ​being executed, and that's a key difference. ​Do we want it in the loop while the plan is executing in between every step, ​getting to decide what happens next? ​Or do we want it to be fully baked, and ​the plan executes completely separately from the agent and ​we lose the ability to respond if there's a mistake between steps? ​But we may gain things in terms of efficiency, costs, speed. ​It may be more repeatable and predictable. ​So if we put an agent in between, just like any other large language model ​response, it may tweak what it does from one time to the next. ​We may not want that. ​And so we're always going to be balancing these two ways of going and ​accomplishing tasks. ​Either it's directly in the loop between every step, or it builds out a fully baked ​plan in advance, and we go and execute that whole plan, very repeatable. ​But if there's mistakes or problems, we can't adapt easily, or ​maybe we want to be somewhere in the middle. ​So here's the rest of our four day plan for Nashville. ​Now, I'm going to go back, and I'm going to say, okay, ​my son loves BMX bike racing. ​Help me plan a road trip from Nashville to New York City. ​I want to drive about five to 6 hours per day. ​Every day needs to stop in a city with a BMX track that he can ride that evening, ​plan my route, and it goes through, and it says Nashville to Louisville, Kentucky, ​that's a good choice. ​There's a great BMX track there. ​It's not too far. ​Then we go to a few more days in, and we get to Hummelston town, BMX. ​And I could not find any information about the existence of ​a BMX track named Hummelstown BMX. ​Maybe it exists, maybe it doesn't, but I sure don't seem to see that it exists. ​It looks like something fictitious. ​And this is a challenge when we begin thinking about plans, ​is that if we build fully fixed, fully fleshed out plans in advance, ​we always run the risk of hallucination. ​That is, it dreams up something in the plan that looks good but isn't real, ​and there's all kinds of ways that it can hallucinate things. ​In this case, it's hallucinating a stop, because it's like, well, I need to stop. ​It knows that there's a Hummelstown, Pennsylvania, so it says, ​well, I'll stop there and ​I'll just dream up a BMX track to be there because we haven't constrained it enough. ​There's no way to easily do this. ​Now, luckily, I'm fact checking before I drive on this road trip, and so ​I can capture that. ​But that's going to be an issue that we're going to deal with. ​Now, how do we overcome issues like this? ​Well, so far, what we've done is just given it sort of open ended prompts, ​but we can start to add in information. ​Upfront we can give it information that we want it to work with, constraints that we ​want it to work with, to try to bound what it does and what it reasons about. ​And this is really, really important when we start thinking about agents ​information, giving the agent access to the information it needs to accomplish ​the task is critically important. ​Now, some cases, it can go and fetch the information for ​itself if we explicitly tell it to do that and when to do it. ​But if we don't give it the ability to go and fetch information, ​we need to give it all the information to accomplish the task and ​not just assume that it'll have access to everything. ​So in this example, I went back and I took that prompt, and ​I copy and pasted the list of every BMX track in Canada, in the United States, ​and I dumped it into that original flipped interaction prompt. ​And then I give it the exact same prompt. ​Basically, my son loves BMX bike racing. ​Go plan this trip. ​And it comes back, and now it's actually correct. ​It's found real tracks, and we have real information to work with. ​And all of these stops appear correct to me. ​I went and did some fact checking. ​I was able to find all of these different tracks. ​We also are roughly within the hourly limit that we set. ​Maybe it's a little too conservative on how far we drive each day. ​Maybe I should go and tell it, well, you need to drive farther, and ​it could adapt the plan. ​But you see, now we're getting a plan fully baked. ​I'm not going to be driving along and saying, yo, ​there's not this BMX track here. ​Like, tell me where to go instead, and driving somewhere else, ​because that doesn't make sense for planning a road trip, right? ​I'm going to go and execute its plan, but I'm not going to have it in the loop. ​And so that's a different sort of style of interaction. ​And we have to figure out when we start building these systems of, like, ​how many steps do we want to have it string together, and then we go and ​execute on its behalf and bring back the result from, or ​do we ever want to bring the result back? ​All of these things are important and ​they will determine how repeatable the process is. ​The more we insert the agent into the middle of the process, ​the less repeatable it's going to be. ​The probably slower it's going to be, ​probably the more expensive it's going to be. ​The more we lean towards a fully baked plan, the more repeatable ​the plan is probably going to be, because there's not any adaptation between. ​But at the same time, we're going to have to be very, ​very careful to try to minimize the number of errors in the plan, ​because if an error happens, it doesn't get to help us and adapt.      what is the user tying to say here, summarzie
**Response**
# Summary of What the Speaker Is Trying to Say

The speaker is explaining **two different ways Agentic AI can plan and execute tasks**, along with their advantages and disadvantages.

## 1. Agents Can Create Plans

Instead of performing actions immediately, an AI agent can:

* Take a high-level goal from the user.
* Break it down into smaller tasks.
* Create a complete plan to achieve the goal.

Example:

```text
Goal: Plan a 4-day trip to Nashville.
```

The agent decomposes it into:

* Day 1 activities
* Day 2 activities
* Day 3 activities
* Day 4 activities

This ability to break a goal into subtasks is a core capability of Agentic AI.

***

## 2. Two Ways an Agent Can Work

### A. Interactive (Step-by-Step) Planning

```text
User → Agent → Action → Feedback → Next Action
```

Characteristics:

* Agent performs one step at a time.
* User can provide corrections.
* Agent can adapt and change the plan.

Example:

```text
Agent: Visit Downtown Nashville.
User: Pancake Pantry is not downtown.
Agent: Thanks, I'll adjust the plan.
```

### Advantages

* Flexible
* Learns from feedback
* Can correct mistakes

### Disadvantages

* Slower
* More expensive
* Less predictable
* May forget previous context

***

### B. Fully-Baked Planning

```text
User → Agent creates entire plan → Execute plan
```

Characteristics:

* Complete plan is created upfront.
* No adaptation during execution.
* Plan is executed exactly as generated.

Example:

```text
Generate entire 4-day Nashville itinerary.
```

### Advantages

* Faster
* More repeatable
* More predictable
* Less costly

### Disadvantages

* Cannot easily fix mistakes while executing
* Errors in the plan affect everything

***

## 3. Hallucination Problem

The speaker gives a road-trip example:

```text
Nashville → New York
Stop every day at a city with a BMX track
```

The AI creates a plan and invents:

```text
"Hummelstown BMX"
```

which appears not to exist.

This is called:

### Hallucination

When AI generates information that sounds correct but is actually false or made up.

***

## 4. How to Reduce Hallucinations

Don't rely only on AI's internal knowledge.

Give the AI:

* Real data
* Constraints
* Trusted information sources

Example:

Instead of saying:

```text
Find BMX tracks.
```

Provide:

```text
Here is a list of all BMX tracks in the US and Canada.
Use only these tracks.
```

Now the agent plans using verified information and produces a more accurate result.

***

## 5. Key Trade-Off

The main message of the entire discussion is:

| Interactive Planning | Fully-Baked Planning  |
| -------------------- | --------------------- |
| Adaptive             | Predictable           |
| Can correct mistakes | Cannot correct easily |
| Slower               | Faster                |
| More costly          | Less costly           |
| Less repeatable      | More repeatable       |

***

## Interview One-Liner

> Agentic AI can either **plan and adapt step-by-step during execution** or **create a complete plan upfront and execute it as-is**. The choice is a trade-off between **flexibility/adaptability** and **speed/predictability**, while ensuring the agent has access to accurate information to reduce hallucinations.
