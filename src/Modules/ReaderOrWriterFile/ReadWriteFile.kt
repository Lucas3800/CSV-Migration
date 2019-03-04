package Modules.ReaderOrWriterFile

import java.io.BufferedReader
import java.io.FileReader

class ReadWriteFile(val pathAndNameCSVFile: String) {

    var fileLines = arrayListOf<String>()

    fun read() {

            var file: BufferedReader? = null
        try {
            file = BufferedReader(FileReader(pathAndNameCSVFile))
            fileLines.addAll(file.readLines())


        } catch(e: Exception) {
                    print("Erro")
        } finally {
            file?.close() ?: "Erro ao finalizar arquivo"
        }
    }
}