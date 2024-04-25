package org.example.codeQuest

class CandidateEliminationSolver {

    fun solve(candidates: MutableList<MutableList<Candidate>>) {
        println("Initial list: $candidates")

        val finalList = performElimination(candidates)
        println("Final list after elimination: $finalList")

        val mostPopular = findMostPopularCandidate(finalList)
        println("Most popular candidate: $mostPopular")
    }

    private fun findLeastPreferredCandidate(candidates: List<List<Candidate>>): Candidate {
        return Candidate.PLUTO
    }

    private fun performElimination(candidates: MutableList<MutableList<Candidate>>): List<List<Candidate>> {
        return candidates
    }

    fun findMostPopularCandidate(finalList: List<List<Candidate>>): Candidate? {
        return Candidate.PLUTO
    }
}

