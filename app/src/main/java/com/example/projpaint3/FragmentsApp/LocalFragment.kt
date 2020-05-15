package com.example.projpaint3.FragmentsApp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projpaint3.Adapter.LocalAdapter
import com.example.projpaint3.Model.Local

import com.example.projpaint3.R
import kotlinx.android.synthetic.main.fragment_local.*

/**
 * A simple [Fragment] subclass.
 */
class LocalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_local, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var SWAT_Paintball = Local(
            "SWAT Paintball",
            "Estr. do Catonho, 1604 - Jardim Sulacap",
            "swatpaintballteam.com.br",
            "(21)95293015"
        )

        var ACP = Local(
            "ACP",
            "Estr. do Catonho, 21902 - Jardim Sulacap",
            "cariocapaintball.com.br",
            "(21)97651-0207"
        )

        var Paintball_Combate = Local(
            "Paintball Combate",
            "Av. Brasil, 961 - Bangu",
            null,
            "(21)97019-8910"
        )

        var Dutra_Paintball = Local(
            "Dutra Paintball",
            "R. Alexandre Fleming, 1094 - Vila Nova, Nova Iguaçu",
            "dutrapaintball.com",
            "(21)97979-0919"
        )

        var Zona_Urbana_Paintball = Local(
            "Zona Urbana Paintball",
            "R. Alfredo Alves de Oliveira, 384 - Centro, São João de Meriti",
            "https://www.facebook.com/pages/Zona-Urbana-Paintball/148992261836221",
            "(21)97156-5586"
        )

        var Paintball_Rio_Sport = Local(
            "Paintball Rio Sport",
            "Avenida Ayrton Senna, 2.541- Lt B - Barra da Tijuca",
            null,
            "(21)3411-7368"
        )

        var Power_Paintball = Local(
            "Power Paintball",
            "Av. Pref. Dulcídio Cardoso, 200 - Recreio dos Bandeirantes",
            "https://power-paintball.negocio.site/",
            "(21)96458-6959"
        )

        var Varzea_Paintball = Local(
            "Varzea Paintball",
            "Rua Torres de Oliveira, 436 - Água Santa",
            null,
            "(21)98877-7763"
        )

        var Top_Shot_Paintball = Local(
            "Top Shot Paintball",
            "R. Vinte e Quatro de Maio, 561 - Riachuelo",
            "https://www.facebook.com/PaintballTopShot",
            "(21)96402-8028"
        )

        var Usina_Paintball = Local(
            "Usina Paintball",
            "Rua Rocha Miranda 32",
            "https://www.facebook.com/pg/paintball.usina/about/?ref=page_internal",
            "(21)98176-8082"
        )

        rcy_locais.adapter = LocalAdapter(mutableListOf(
            SWAT_Paintball,ACP,Paintball_Combate,
            Dutra_Paintball,Zona_Urbana_Paintball,
            Paintball_Rio_Sport,Power_Paintball,
            Varzea_Paintball, Top_Shot_Paintball,
            Usina_Paintball
        ))

        rcy_locais.layoutManager = LinearLayoutManager(activity!!.baseContext)
    }
}
