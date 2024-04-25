package org.example.codeQuest

class CandidateEliminationSolver {

    fun findMostPopularCandidate(candidates: MutableList<MutableList<Candidate>>): Candidate? {
        if (candidates.isEmpty() || candidates.firstOrNull()?.isEmpty() == true) {
            println("List of candidates is empty.")
            return null
        }

        val maxIndex = candidates.first().size - 1

        var counter = 0
        while (counter < maxIndex) {
            println("Max index: $maxIndex, Counter: $counter")
            performElimination(candidates)
            counter++
        }
        return candidates.firstOrNull()?.firstOrNull()
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

    private fun prettyPrintList(candidates: List<MutableList<Candidate>>) {
        if (candidates.isEmpty()) {
            println("List is empty.")
            return
        }

        candidates.forEach { candidateList ->
            candidateList.forEach { candidate ->
                print("$candidate ")
            }
            println()
        }
    }

}

