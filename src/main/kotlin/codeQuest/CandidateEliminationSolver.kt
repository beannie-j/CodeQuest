package org.example.codeQuest

class CandidateEliminationSolver {

    fun solve(candidates: MutableList<MutableList<Candidate>>): Candidate? {
        return findMostPopularCandidate(candidates)
    }

    private fun findLeastPreferredCandidate(candidates: List<List<Candidate>>): Candidate {
        val countMap = mutableMapOf<Candidate, Int>()

        candidates.forEach { list ->
            val firstCandidate = list.first()
            val voteCount = countMap.getOrDefault(firstCandidate, 0) + 1
            countMap[firstCandidate] = voteCount
        }

        val leastPreferredCandidate = countMap.minBy { it.value }.key
        println("Least preferred candidate: $leastPreferredCandidate")
        return leastPreferredCandidate
    }

    private fun performElimination(candidates: List<MutableList<Candidate>>): List<MutableList<Candidate>> {
        println("Initial list: ")
        prettyPrintList(candidates)

        val leastPreferredCandidate = findLeastPreferredCandidate(candidates)

        candidates.forEach { list: MutableList<Candidate> ->
            list.remove(leastPreferredCandidate)
        }
        println("Final list after elimination: ")
        prettyPrintList(candidates)
        return candidates
    }

    fun findMostPopularCandidate(finalList: List<MutableList<Candidate>>): Candidate? {
        val maxIndex = (finalList.firstOrNull()?.size ?: 0) - 1

        var counter = 0

        while (counter < maxIndex) {
            println("Max index: $maxIndex, Counter: $counter")
            performElimination(finalList)
            counter++
        }

        return finalList.firstOrNull()?.firstOrNull()
    }

    private fun prettyPrintList(candidates: List<MutableList<Candidate>>) {
        if (candidates.isEmpty()) {
            println("List is empty.")
            return
        }

        candidates.forEachIndexed { index, candidateList ->
            candidateList.forEach { candidate ->
                print("$candidate ")
            }
            println()
        }
    }
}

