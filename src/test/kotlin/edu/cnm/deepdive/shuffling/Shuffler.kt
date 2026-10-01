package edu.cnm.deepdive.shuffling

import java.util.random.RandomGenerator

class Shuffler(rng: RandomGenerator) {


    private val rng: RandomGenerator = rng;

    fun shuffle(data: Array<String>){
        for (target: Int in data.lastIndex downTo 1) {
             val source: Int = rng.nextInt(target + 1)
            val temp: String = data[target]
            data[target] = data[source]
            data[source] = temp
        }

    }

}