package br.com.blueapps.financask.model

import java.math.BigDecimal
import java.util.Calendar

/**
 * Created by douglasnunes on 22/12/17.
 */
class Transacao(val valor : BigDecimal,
                val categoria : String = "Indefinida",
                val tipo : Tipo,
                val data : Calendar = Calendar.getInstance())