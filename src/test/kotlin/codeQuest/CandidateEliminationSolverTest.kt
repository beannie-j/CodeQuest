package codeQuest

import org.example.codeQuest.Candidate
import org.example.codeQuest.CandidateEliminationSolver
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CandidateEliminationSolverTest {

    private lateinit var solver: CandidateEliminationSolver

    @BeforeEach
    fun setUp() {
        solver = CandidateEliminationSolver()
    }

    @Test
    fun `test solving`() {
        val candidates = mutableListOf(
            mutableListOf(Candidate.DONALD, Candidate.MICKEY, Candidate.PLUTO),
            mutableListOf(Candidate.DONALD, Candidate.MICKEY, Candidate.PLUTO),
            mutableListOf(Candidate.DONALD, Candidate.MICKEY, Candidate.PLUTO),
            mutableListOf(Candidate.MICKEY, Candidate.MICKEY, Candidate.PLUTO),
            mutableListOf(Candidate.PLUTO, Candidate.MICKEY, Candidate.DONALD)
        )

        solver.solve(candidates)

        val expectedFinalList = mutableListOf(listOf(Candidate.DONALD))
        val expectedMostPopular = Candidate.DONALD

        assertEquals(expectedFinalList, candidates)
        assertEquals(expectedMostPopular, solver.findMostPopularCandidate(expectedFinalList))
    }
}