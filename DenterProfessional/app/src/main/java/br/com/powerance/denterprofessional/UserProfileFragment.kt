package br.com.powerance.denterprofessional

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.powerance.denterprofessional.databinding.FragmentUserProfileBinding


class UserProfileFragment: Fragment() {

    private var _binding: FragmentUserProfileBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentUserProfileBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvUsertoEmergencie.setOnClickListener {
            findNavController().navigate(R.id.action_User_to_Emergency)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}