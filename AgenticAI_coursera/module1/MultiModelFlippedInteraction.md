**Prompt [what is multimodel flipped Interaction in agentic... | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZEQm1OV0prT0RKakxUVXlOek10TkdWaFl5MWlPREF5TFdSalpXTTBNakl6TnpRMU1ud3lNREkyTFRBM0xUSXlWREEwT2pJeE9qSTFMalE1TWpnNE56bGEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTIyVDA0OjIxOjI1LjEzNloifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
what is multimodel flipped Interaction in agentic AI
**Response**
# Multimodal Flipped Interaction Pattern in Agentic AI

**Multimodal Flipped Interaction** is an Agentic AI pattern where the **AI agent drives the interaction by deciding which modality (text, image, speech, video, documents, APIs, etc.) to use**, instead of the user explicitly providing all instructions and formats.

### Traditional Interaction

```text
User → AI → Response
```

Example:

```text
User: Summarize this PDF.
AI: Returns summary.
```

The user controls the flow.

***

### Flipped Interaction

```text
User → Agent
       ↓
Agent decides:
  • Ask questions
  • Retrieve documents
  • Analyze images
  • Call tools
  • Generate report
       ↓
Final Result
```

The **agent takes initiative** and determines the next steps.

***

### Multimodal + Flipped Interaction

The agent can switch between multiple input/output modes.

Example:

```text
User: Help me understand why sales dropped.
```

Agent workflow:

1. Reads Excel sales data.
2. Analyzes charts.
3. Reviews meeting transcripts.
4. Checks CRM notes.
5. Creates visual dashboard.
6. Provides recommendations.

Here the user only gave a goal. The agent decided which modalities to use:

* Text → meeting transcripts
* Spreadsheet → sales data
* Images/Charts → trend analysis
* APIs → CRM data
* Report → final output

***

# Real-World Example

### Insurance Claim Agent

User:

```text
My car was damaged. Can you help me file a claim?
```

Agent actions:

1. Requests damage photos.
2. Analyzes images using computer vision.
3. Extracts details from uploaded documents.
4. Uses speech-to-text if user sends voice notes.
5. Queries insurance policy database.
6. Generates claim form automatically.

Multiple modalities involved:

```text
Photos
↓
Documents
↓
Voice
↓
Database
↓
Report
```

The agent orchestrates everything.

***

# Why "Flipped"?

In traditional systems:

```text
User tells AI what to do step by step.
```

In flipped interaction:

```text
User provides goal.
AI figures out the workflow.
```

The responsibility is "flipped" from the user to the agent.

***

# Interview Definition

> **Multimodal Flipped Interaction Pattern** is an Agentic AI design pattern where a user provides a high-level objective, and the AI agent autonomously determines how to interact using multiple modalities (text, images, audio, documents, APIs, tools, etc.) to gather information, reason, and complete the task, rather than relying on step-by-step user instructions.

### One-Line Example

```text
User: Analyze my business performance.

Agent:
Reads Excel → Analyzes charts → Reviews emails →
Queries CRM → Generates presentation with recommendations.
```

This is a classic **Multimodal Flipped Interaction** pattern in Agentic AI.
