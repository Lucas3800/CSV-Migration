import Modules.ReaderOrWriterFile.*
import Modules.GUI.*

private val pathAndNameCSVFile = "C:\\Migracoes\\CEUS\\pessoas\\alunos_ceus\\alunos_ceus.csv"

fun main(args: Array<String>) {
    var CSVFile = ReadWriteFile(pathAndNameCSVFile)
    var SQLFile = ReadWriteFile(pathAndNameCSVFile)

    CSVFile.read()
}