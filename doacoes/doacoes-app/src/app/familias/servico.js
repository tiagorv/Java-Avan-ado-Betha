import AbstractCrudService from "../abstract.crud.service";

export default class FamiliaServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/doacoes-web/api/familias')
  }

}

FamiliaServico.$inject = ['$http']
