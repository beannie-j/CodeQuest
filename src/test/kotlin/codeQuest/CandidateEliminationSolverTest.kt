package codeQuest

import org.assertj.core.api.Assertions.assertThat
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
            mutableListOf(Candidate.DONALD, Candidate.MICKEY, Candidate.PLUTO),
            mutableListOf(Candidate.MICKEY, Candidate.DONALD, Candidate.PLUTO),
            mutableListOf(Candidate.MICKEY, Candidate.DONALD, Candidate.PLUTO),
            mutableListOf(Candidate.PLUTO, Candidate.DONALD, Candidate.MICKEY)
        )

        solver.solve(candidates)

        val expectedFinalList =
            mutableListOf(
                mutableListOf(Candidate.DONALD),
                mutableListOf(Candidate.DONALD),
                mutableListOf(Candidate.DONALD),
                mutableListOf(Candidate.DONALD),
                mutableListOf(Candidate.DONALD),
                mutableListOf(Candidate.DONALD),
                mutableListOf(Candidate.DONALD)
            )

//        val actualFinalList = solver.performElimination(candidates)

        val mostPopularCandidate = solver.findMostPopularCandidate(expectedFinalList)

//        assertThat(actualFinalList).isEqualTo(expectedFinalList)
        assertThat(mostPopularCandidate).isEqualTo(Candidate.DONALD)
    }
}