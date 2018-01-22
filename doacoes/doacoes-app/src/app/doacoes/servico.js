import AbstractCrudService from "../abstract.crud.service";

export default class DoacaoServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/doacoes-web/api/doacoes')
  }

}

DoacaoServico.$inject = ['$http']
