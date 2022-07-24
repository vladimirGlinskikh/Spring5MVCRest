package kz.zhelezyaka.repositories;

import kz.zhelezyaka.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
