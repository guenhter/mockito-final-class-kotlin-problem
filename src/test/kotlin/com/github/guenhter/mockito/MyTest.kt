package com.github.guenhter.mockito

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock


class MyClass

class MyTest {
    private lateinit var myClassMock: MyClass

    @BeforeEach
    fun `before each`() {
        myClassMock = mock(MyClass::class.java)
    }

    @Test
    fun `some test`() { }
}