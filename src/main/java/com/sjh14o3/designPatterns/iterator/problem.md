# Design Pattern Iterator

Behavioral Pattern

## Problem: Build a Playlist Iterator

### Scenario

You are developing a music player application.
The application stores songs in a playlist.

Currently, the application exposes its internal collection of songs directly.
This creates a problem: clients need to know how the playlist stores its songs (ArrayList, LinkedList, etc.).

Your task is to implement the Iterator Design Pattern so clients can traverse the playlist without knowing
its internal implementation.

## Requirements

### 1. Song class

Create a `Song` class with:

- `title: String`
- `artist: String`
- `durationInSeconds: Int`

### 2. Playlist class

Create a `Playlist` class that:

- Stores a collection of songs internally.
- Provides a method to add songs.
- Does not expose its internal collection.
- Provides a way to obtain an iterator.

### 3. Iterator

Implement an iterator that:

- Returns songs one at a time.
- Knows whether more songs are available.
- Throws an appropriate exception if the client tries to retrieve an element when no elements remain.

### 4. Client

Write a client that:

1. Creates a playlist.
2. Adds at least four songs.
3. Obtains an iterator.
4. Traverses the playlist without accessing its internal collection.

## Expected behavior

For example, given these songs:

| Title         | Artist          |
|---------------|-----------------|
| Believer      | Imagine Dragons |
| Numb          | Linkin Park     |
| Yellow        | Coldplay        |
| The Scientist | Coldplay        |

The client should produce:

```
Playing playlist:

Believer - Imagine Dragons
Numb - Linkin Park
Yellow - Coldplay
The Scientist - Coldplay

End of playlist.
```

## Constraints

1. Do not expose the internal collection.
2. The client must not depend on `ArrayList` or `MutableList`.
3. Keep the iteration logic separate from playlist storage.
4. Follow object-oriented design principles.

## Bonus challenges

Once the basic implementation works, try these:

- Challenge 1: Implement a reverse iterator that traverses songs backward.
- Challenge 2: Implement a shuffled iterator that returns songs in random order without modifying the original playlist.
- Challenge 3: Support multiple independent iterators over the same playlist.
- Challenge 4: Make the playlist implement Kotlin's standard `Iterable<Song>` interface.