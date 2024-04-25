package codeQuest

import org.assertj.core.api.Assertions.assertThat
import org.example.codeQuest.Candidate
import org.example.codeQuest.CandidateEliminationSolver
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test

class CandidateEliminationSolverTest {

    private lateinit var candidateEliminationSolver: CandidateEliminationSolver

    @BeforeEach
    fun setUp() {
        candidateEliminationSolver = CandidateEliminationSolver()
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

        candidateEliminationSolver.findMostPopularCandidate(candidates)

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

        val mostPopularCandidate = candidateEliminationSolver.findMostPopularCandidate(expectedFinalList)

        assertThat(mostPopularCandidate).isEqualTo(Candidate.DONALD)
    }
}